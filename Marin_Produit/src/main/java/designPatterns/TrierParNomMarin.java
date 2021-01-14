package designPatterns;

import java.util.ArrayList;

import Exploration.Marin;

public class TrierParNomMarin implements SortingStrategy {

	public ArrayList<Resultat> trier(ArrayList<Resultat> results) {
		for (Resultat result : results) {
			boolean sorted = false;
			while (!sorted) {
				sorted = true;
				for (int i = 0; i < result.getMarins().size() - 1; i++) {
					int compare = result.getMarins().get(i).getNom().compareTo(result.getMarins().get(i + 1).getNom());
					if (compare > 0) {
						Marin temp = result.getMarins().get(i);
						result.getMarins().set(i, result.getMarins().get(i + 1));
						result.getMarins().set(i + 1, temp);
						sorted = false;
					}
				}
			}
		}

		return results;
	}

}

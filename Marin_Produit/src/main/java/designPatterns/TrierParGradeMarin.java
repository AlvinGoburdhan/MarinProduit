package designPatterns;

import java.util.ArrayList;

import Exploration.Marin;

public class TrierParGradeMarin implements SortingStrategy {

	public ArrayList<Resultat> trier (ArrayList<Resultat> resultats) {
		for (Resultat resultat : resultats) {
			boolean sorted = false;
			while (!sorted) {
				sorted = true;
				for (int i = 0; i < resultat.getMarins().size() - 1; i++) {
					if (resultat.getMarins().get(i).getGrade() < resultat.getMarins().get(i+1).getGrade()) {
						Marin temp = resultat.getMarins().get(i);
						resultat.getMarins().set(i, resultat.getMarins().get(i + 1));
						resultat.getMarins().set(i + 1, temp);
						sorted = false;
					}
				}
			}
		}
		return resultats; 
	}

}

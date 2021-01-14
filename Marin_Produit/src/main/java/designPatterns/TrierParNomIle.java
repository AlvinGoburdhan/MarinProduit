package designPatterns;

import java.util.ArrayList;

public class TrierParNomIle implements SortingStrategy {

	public ArrayList<Resultat> trier(ArrayList<Resultat> results) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < results.size() - 1; i++) {
				if (results.get(i).getNomIle().compareTo(results.get(i + 1).getNomIle()) > 0) {
					Resultat temp = results.get(i);
					results.set(i, results.get(i + 1));
					results.set(i + 1, temp);
					sorted = false;
				}
			}
		}
		return results;
	}

}

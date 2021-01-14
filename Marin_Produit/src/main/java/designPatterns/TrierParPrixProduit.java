package designPatterns;

import java.util.ArrayList;

public class TrierParPrixProduit implements SortingStrategy {

	public ArrayList<Resultat> trier(ArrayList<Resultat> results) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < results.size() - 1; i++) {
				if (results.get(i).getPrixProduit() > results.get(i + 1).getPrixProduit()) {
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
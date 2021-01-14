package designPatterns;

import java.util.ArrayList;

import Exploration.Ile;
import produit.Produit;

public class ChercherProduitDansIles {

	private ArrayList<Resultat> resultats = new ArrayList<Resultat>();

	public ArrayList<Resultat> parNom(ArrayList<Ile> iles, String nomProduit) {
		for (Ile ile : iles) {
			for (Produit produit : ile.getProduits()) {
				if (produit.getNomProduit().equals(nomProduit)) {
					Resultat resultat = new Resultat();
					resultat.setNomIle(ile.getNomIle());
					resultat.setMarins(ile.getMarins());
					resultat.setPrixProduit(produit.getPrix());
					resultats.add(resultat);
				}
			}
		}
		return resultats;
	}
}
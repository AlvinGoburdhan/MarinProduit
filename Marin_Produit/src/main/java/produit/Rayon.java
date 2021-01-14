package produit;

import java.util.ArrayList;

public class Rayon {
	private String nomRayon = null;
	private ArrayList<Produit> listeProduit = new ArrayList<Produit>();

	public Rayon(String nom) {
		this.nomRayon = nom;
	}

	public String getNomRayon() {
		return this.nomRayon;
	}

	public void setRayon(String nomRayon) {
		this.nomRayon = nomRayon;
	}

	public void addProduit(Produit produit) {
		if (produit.getRayon() == null) {
			this.listeProduit.add(produit);
			produit.setRayon(this);
		}
	}

	public ArrayList<Produit> getListeProduit() {
		return listeProduit;
	}

}

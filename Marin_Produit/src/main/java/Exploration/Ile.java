package Exploration;

import java.util.ArrayList;

import produit.Produit;

public class Ile {
	private String nomIle;
	private int nbVisite;
	private ArrayList<Marin> marins = new ArrayList<Marin>();
	private ArrayList<Produit> produits = new ArrayList<Produit>();

	public Ile(String ile) {
		this.nomIle = ile;
	}

	public Ile(String ile, int nbVisite) {
		this.nomIle = ile;
		this.nbVisite = nbVisite;
	}

	public String getNomIle() {
		return this.nomIle;
	}

	public void setNomIle(String nomIle) {
		this.nomIle = nomIle;
	}

	public int getnbVisiteIle() {
		return this.nbVisite;
	}

	public void setnbVisiteIle(int nbVisite) {
		this.nbVisite = nbVisite;

	}

	public void addMarin(Marin marin) {
		this.marins.add(marin);
	}

	public ArrayList<Marin> getMarins() {
		return this.marins;
	}

	public ArrayList<String> getNomsMarins() {
		ArrayList<String> nomsMarins = new ArrayList<String>();
		for (Marin item : this.marins) {
			nomsMarins.add(item.getNom());
		}
		return nomsMarins;
	}

	public void addProduit(Produit produit) {
		this.produits.add(produit);
	}

	public ArrayList<Produit> getProduits() {
		return this.produits;
	}
}

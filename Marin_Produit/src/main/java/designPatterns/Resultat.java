package designPatterns;

import java.util.ArrayList;

import Exploration.Marin;

public class Resultat {

	private String nomIle;
	private ArrayList<Marin> marins;
	private float prixProduit;

	public float getPrixProduit() {
		return this.prixProduit;
	}

	public void setPrixProduit(float prixProduit) {
		this.prixProduit = prixProduit;
	}

	public ArrayList<Marin> getMarins() {
		return this.marins;
	}

	public void setMarins(ArrayList<Marin> marins) {
		this.marins = marins;
	}

	public String getNomIle() {
		return this.nomIle;
	}

	public void setNomIle(String nomIle) {
		this.nomIle = nomIle;
	}

	public ArrayList<String> getNomsMarins() {
		ArrayList<String> nomsMarins = new ArrayList<String>();
		for (Marin item : this.marins) {
			nomsMarins.add(item.getNom());
		}
		return nomsMarins;
	}

	public String toString() {
		return "Ile: " + this.getNomIle() + " |Marins: "
				+ this.getNomsMarins() + " |Prix: " + this.getPrixProduit();

	}
}
package Exploration;

import java.util.ArrayList;

public class Marin {
	private int grade;
	private int visite;
	private String nom;
	private ArrayList<Ile> ilesVisitees = new ArrayList<Ile>();

	public Marin(String nom) {
		this.nom = nom;
	}

	public Marin(String nom, int grade) {
		this.nom = nom;
		this.grade = grade;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGrade() {
		return this.grade;
	}

	public int visite(int visite, Ile ile) {
		return extracted(visite, ile);
	}

	private int extracted(int visite, Ile ile) {
		this.visite += visite;
		this.addIle(ile);
		return this.visite;
	}

	public void addIle(Ile ile) {
		this.ilesVisitees.add(ile);
		ile.addMarin(this);
	}

	public ArrayList<Ile> getIles() {
		return this.ilesVisitees;
	}

	public int sizeIle() {
		return ilesVisitees.size();
	}

	public int totalVisiteIle() {
		int nbVisite = 0;

		for (Ile ile : this.ilesVisitees) {
			nbVisite = nbVisite + ile.getnbVisiteIle();
		}
		return nbVisite;
	}

	public int updateGrade(int nbVisite) {
		int newGrade = 0;
		if (nbVisite > 1) {
			newGrade = this.grade + 1;
		} else {
			newGrade = this.grade;
		}
		return newGrade;
	}
}

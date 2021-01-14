package produit;

public class Produit {
	private String nomProduit;
	private String categorie;
	private float prix;
	private Rayon rayon = null;

	public Produit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	

	public Produit(String nomProduit, float prix) {
		this.nomProduit = nomProduit;
		this.prix = prix;
	}

	public Produit(String nomProduit, String nomCategorie, float prix) {
		this.nomProduit = nomProduit;
		this.categorie = nomCategorie;
		this.prix = prix;
	}

	public String getNomProduit() {
		return this.nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public String getCategorie() {
		return this.categorie;
	}

	public void setCategorie(String nomCategorie) {
		this.categorie = nomCategorie;
	}

	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public float prixApresRemise(float remise) {
		return this.prix * (1 - remise);
	}

	public Rayon getRayon() {
		return this.rayon;
	}

	public void setRayon(Rayon rayon) {
		this.rayon = rayon;
	}
}

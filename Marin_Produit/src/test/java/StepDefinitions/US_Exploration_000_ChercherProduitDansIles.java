package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import Exploration.Ile;
import Exploration.Marin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import produit.Produit;
import designPatterns.ChercherProduitDansIles;
import designPatterns.Resultat;

public class US_Exploration_000_ChercherProduitDansIles {
	private Produit produit;
	private Marin marin;
	private Ile ile;
	private ArrayList<Ile> iles = new ArrayList<Ile>();
	private ArrayList<Resultat> resultats;

	@Given("que jai les produits suivants dans les iles")
	public void que_jai_les_produits_suivants_dans_les_iles(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		for (List<String> columns : rows) {
			produit = new Produit(columns.get(0));
			produit.setPrix(Float.parseFloat(columns.get(3)));
			// System.out.println( produit.getNomProduit() +" " + produit.getPrix());

			ile = new Ile(columns.get(1));
			ile.addProduit(produit);
			marin = new Marin(columns.get(2));
			ile.addMarin(marin);

			iles.add(ile);
		}
		
	}

	@When("le Vendeur cherche {string}")
	public void le_vendeur_cherche(String nomProduit) {
//		System.out.println("Dans When");
//		System.out.println(nomProduit);

//		System.out.println(iles.get(0).getNomIle() + " " + iles.get(0).getMarins().get(0).getNom()
//				+ iles.get(0).getProduits().get(0).getNomProduit() + iles.get(0).getProduits().get(0).getPrix());
//		
//		System.out.println(iles.get(1).getNomIle() + " " + iles.get(1).getMarins().get(0).getNom()
//				+ iles.get(1).getProduits().get(0).getNomProduit() + iles.get(1).getProduits().get(0).getPrix());
		
		ChercherProduitDansIles chercherProduit = new ChercherProduitDansIles();
		resultats = chercherProduit.parNom(iles, "Patate");

		 for (Resultat item : resultats) {
		 System.out.println(item);
		 }
	}

	@Then("{string}, {string}, {string} sont retournes")
	public void sont_retournes(String nomsIles, String nomsMarins, String prix) {
		assertEquals(nomsIles,resultats.get(0).getNomIle());
		assertEquals(nomsMarins,resultats.get(0).getMarins().get(0).getNom());
		assertEquals(Float.parseFloat(prix),resultats.get(0).getPrixProduit(),0.0f);
	}

}

package StepDefinitions;

import java.util.List;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import produit.Produit;
import produit.Rayon;

public class US_Produit_001_NombreDeProduitDansUnRayon {
	private Produit produit;
	private Rayon rayon;

	@Given("que j ai les produits suivants dans le rayon {string}")
	public void que_j_ai_les_produits_suivants_dans_le_rayon(String string, io.cucumber.datatable.DataTable dataTable) {
		rayon = new Rayon(string);
		List<List<String>> rows = dataTable.asLists(String.class);
		for (List<String> columns : rows) {
	    	produit = new Produit(columns.get(0));
	    	rayon.addProduit(produit);
	    }
	}

	@When("le Vendeur cherche le nombre de produits")
	public void le_vendeur_cherche_le_nombre_de_produits() {
	}

	@Then("je trouve {int} produits")
	public void je_trouve_produits(int nombre) {
		assertEquals(nombre, rayon.getListeProduit().size());
		
		
	}
	
	@Given("que je n ai aucun produits dans le rayon {string}")
	public void que_je_n_ai_aucun_produits_dans_le_rayon(String string) {
		rayon = new Rayon(string);
	}
	
}

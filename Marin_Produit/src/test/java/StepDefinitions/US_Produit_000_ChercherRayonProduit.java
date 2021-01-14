package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import produit.Produit;
import produit.Rayon;
import io.cucumber.java.en.Then;


import org.junit.Assert;
	
public class US_Produit_000_ChercherRayonProduit {
	private Produit produit;
	private Rayon rayon;
	
	@Given("un {string} de {string}")
	public void un_de(String string, String string2) {
		this.produit = new Produit (string);
		this.rayon = new Rayon (string2);
		this.produit.setRayon(rayon);
	}
	
	@When("le Vendeur en fait la demande")
	public void le_vendeur_en_fait_la_demande() {
	}
	
	@Then("{string} est retournee")
	public void est_retournee(String string) {
		Assert.assertEquals(string,produit.getRayon().getNomRayon());
	}
	
	@Then("un {string} est retournee")
	public void un_est_retournee(String string) {
		Assert.assertEquals(string,"Pas de rayon");
	}


}
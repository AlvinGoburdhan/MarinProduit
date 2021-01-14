package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Exploration.Marin;
import designPatterns.Resultat;
import designPatterns.Sorter;
import designPatterns.TrierParGradeMarin;
import designPatterns.TrierParNomIle;
import designPatterns.TrierParNomMarin;
import designPatterns.TrierParPrixProduit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_Exploration_0001_TrierLeResultatDeLaRecherche {

	private ArrayList<Resultat> resultats = new ArrayList<Resultat>();

	@Given("que jai les resultats suivants de la recherche d'un produit sur des iles")
	public void que_jai_les_resultats_suivants_de_la_recherche_d_un_produit_sur_des_iles(
			io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);

		for (List<String> columns : rows) {
			ArrayList<Marin> marins = new ArrayList<Marin>();

			Resultat resultat = new Resultat();
			resultat.setNomIle(columns.get(0));

			List<String> nomMarins = Arrays.asList(columns.get(1).split(","));
			List<String> gradeMarins = Arrays.asList(columns.get(2).split(","));

			for (int i = 0; i < nomMarins.size(); i++) {
				Marin marin = new Marin(nomMarins.get(i), Integer.parseInt(gradeMarins.get(i)));
				marins.add(marin);
			}

			resultat.setMarins(marins);

			resultat.setPrixProduit(Float.parseFloat(columns.get(3)));

			resultats.add(resultat);
		}
	}

	@When("le Vendeur tri par prix de produit")
	public void le_vendeur_tri_par_prix() {
		Sorter sorter = new Sorter(new TrierParPrixProduit());
		sorter.trier(resultats);
//		for (Resultat item : resultats) {
//			System.out.println(item);
//		}

	}

	@Then("le resultat trie par prix est le suivant")
	public void le_resultat_trie_par_prix_est_le_suivant(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		int i = 0;
		for (List<String> columns : rows) {
			assertEquals(resultats.get(i).getPrixProduit(), Float.parseFloat(columns.get(3)), 0.0f);
			i++;
		}
	}
	
	
	@When("le Vendeur tri par prix nom d'ile")
	public void le_vendeur_tri_par_prix_nom_d_ile() {
		Sorter sorter = new Sorter(new TrierParNomIle());
		sorter.trier(resultats);
//		for (Resultat item : resultats) {
//			System.out.println(item);
//		}
	}

	@Then("le resultat trie par nom d'ile est le suivant")
	public void le_resultat_trie_par_nom_d_ile_est_le_suivant(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		int i = 0;
		for (List<String> columns : rows) {
			assertEquals(resultats.get(i).getNomIle(), columns.get(0));
			i++;
		}
	}

	@When("le Vendeur tri par nom de marin")
	public void le_vendeur_tri_par_nom_de_marin() {
		Sorter sorter = new Sorter(new TrierParNomMarin());
		sorter.trier(resultats);
//		for (Resultat item : resultats) {
//			System.out.println(item);
//		}
	}

	@Then("le resultat trie par nom de marin est le suivant")
	public void le_resultat_trie_par_nom_de_marin_est_le_suivant(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		int i = 0;
		for (List<String> columns : rows) {
			List<String> nomMarins = Arrays.asList(columns.get(1).split(","));
			int j = 0;
			for (String nomMarin : nomMarins) {
				assertEquals(resultats.get(i).getMarins().get(j).getNom(), nomMarin);
				j++;
			}
			i++;
		}
	}

	@When("le Vendeur tri par grade de marin")
	public void le_vendeur_tri_par_grade() {
		Sorter sorter = new Sorter(new TrierParGradeMarin());
		sorter.trier(resultats);
//		for (Resultat item : resultats) {
//			System.out.println(item);
//		}
	}

	@Then("le resultat trie par grade de marin est le suivant")
	public void le_resultat_trie_par_grade_est_le_suivant(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> rows = dataTable.asLists(String.class);
		int i = 0;
		for (List<String> columns : rows) {
			List<String> nomMarins = Arrays.asList(columns.get(1).split(","));
			int j = 0;
			for (String nomMarin : nomMarins) {
				assertEquals(resultats.get(i).getMarins().get(j).getNom(), nomMarin);
				j++;
			}
			i++;
		}
	}

}

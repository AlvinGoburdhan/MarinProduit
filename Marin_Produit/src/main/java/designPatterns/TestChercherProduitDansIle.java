package designPatterns;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Exploration.Ile;
import Exploration.Marin;
import produit.Produit;

public class TestChercherProduitDansIle {
	private Ile ile1;
	private Ile ile2;
	private Ile ile3;
	private Marin marin1;
	private Marin marin2;
	private Marin marin3;
	private Produit produit1;
	private Produit produit2;
	private Produit produit3;
	private Produit produit4;
	private Produit produit5;
	private Produit produit6;
	private ArrayList<Ile> iles;

	@Before
	public void setUp() {

		ile1 = new Ile("Kauai");
		ile2 = new Ile("Oahu");
		ile3 = new Ile("Molokai");

		marin1 = new Marin("Jack", 3);
		marin2 = new Marin("Robert", 2);
		marin3 = new Marin("Paul", 1);

		produit1 = new Produit("patate", 2);
		produit2 = new Produit("patate", 1.5f);
		produit3 = new Produit("carotte", 1.1f);
		produit4 = new Produit("carotte", 1.3f);
		produit5 = new Produit("tomate", 1.7f);
		produit6 = new Produit("tomate", 1.8f);

		marin3.addIle(ile1);
		marin1.addIle(ile1);
		marin1.addIle(ile2);
		marin2.addIle(ile2);
		marin3.addIle(ile2);
		marin3.addIle(ile3);

		ile1.addProduit(produit1);
		ile1.addProduit(produit3);
		ile1.addProduit(produit5);
		ile2.addProduit(produit2);
		ile2.addProduit(produit4);
		ile3.addProduit(produit6);

		iles = new ArrayList<Ile>();
		iles.addAll(Arrays.asList(ile1, ile2, ile3));
	}

	@Test
	public void testParNom() {
		ChercherProduitDansIles chercherProduit = new ChercherProduitDansIles();
		ArrayList<Resultat> results = chercherProduit.parNom(iles, "patate");
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Paul");
		list1.add("Jack");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Jack");
		list2.add("Robert");
		list2.add("Paul");

		assertTrue(results.size() == 2);
		assertEquals(results.get(0).getNomIle(), "Kauai");
		assertEquals(results.get(0).getNomsMarins(), list1);
		Assert.assertEquals(results.get(0).getPrixProduit(), 2.0f, 0.0f);
		assertEquals(results.get(1).getNomIle(), "Oahu");
		assertEquals(results.get(1).getNomsMarins(), list2);
		Assert.assertEquals(results.get(1).getPrixProduit(), 1.5f, 0.0f);

	}

}

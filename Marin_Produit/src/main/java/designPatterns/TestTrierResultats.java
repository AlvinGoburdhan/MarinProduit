package designPatterns;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Exploration.Marin;

public class TestTrierResultats {
	ArrayList<Resultat> resultats = new ArrayList<Resultat>();

	@Before
	public void setUp() {
		Resultat resultat1 = new Resultat();
		Resultat resultat2 = new Resultat();

		resultat1.setNomIle("Oahu");
		resultat2.setNomIle("Kauai");

		resultat1.setPrixProduit(2.0f);
		resultat2.setPrixProduit(1.5f);

		ArrayList<Marin> marinsResultat1 = new ArrayList<Marin>();
		ArrayList<Marin> marinsResultat2 = new ArrayList<Marin>();

		marinsResultat1.add(new Marin("Jack", 3));
		marinsResultat1.add(new Marin("Robert", 1));
		marinsResultat1.add(new Marin("Paul", 2));

		marinsResultat2.add(new Marin("Jack", 3));
		marinsResultat2.add(new Marin("Robert", 1));
		marinsResultat2.add(new Marin("Paul", 2));

		resultat1.setMarins(marinsResultat1);
		resultat2.setMarins(marinsResultat2);

		resultats.add(resultat1);
		resultats.add(resultat2);
	}

	@Test
	public void testTrierParGradeMarin() {
		Sorter sorter = new Sorter(new TrierParGradeMarin());
		sorter.trier(resultats);
		ArrayList<String> marinsTrieParGrade = new ArrayList<String>();
		marinsTrieParGrade.add("Jack");
		marinsTrieParGrade.add("Paul");
		marinsTrieParGrade.add("Robert");

		Assert.assertTrue(resultats.get(0).getNomsMarins().equals(marinsTrieParGrade));
		Assert.assertTrue(resultats.get(1).getNomsMarins().equals(marinsTrieParGrade));
	}

	@Test
	public void testTrierParNomIle() {
		Sorter sorter = new Sorter(new TrierParNomIle());
		sorter.trier(resultats);

		Assert.assertEquals("Kauai", resultats.get(0).getNomIle());
		Assert.assertEquals("Oahu", resultats.get(1).getNomIle());
	}

	@Test
	public void testTrierParPrix() {
		Sorter sorter = new Sorter(new TrierParPrixProduit());
		sorter.trier(resultats);

		Assert.assertEquals(resultats.get(0).getPrixProduit(), 1.5f, 0.0f);
		Assert.assertEquals(resultats.get(1).getPrixProduit(), 2.0f, 0.0f);

	}

	@Test
	public void testTrierParNomMarin() {
		Sorter sorter = new Sorter(new TrierParNomMarin());
		sorter.trier(resultats);

		ArrayList<String> listeNom = new ArrayList<String>();
		listeNom.add("Jack");
		listeNom.add("Paul");
		listeNom.add("Robert");

		Assert.assertEquals(resultats.get(0).getNomsMarins(), listeNom);
	}

}

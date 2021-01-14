package produit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RayonTest {

	@Test
	public void testAddProduit() {
		Produit produit = new Produit("patate");
		Rayon rayon = new Rayon("Fruits et légumes");
		
		rayon.addProduit(produit);
		
		assertEquals(rayon.getListeProduit().get(0), produit);
		
	}

}

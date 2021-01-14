package Exploration;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MarinTest {

	private Marin marin;
	private Marin marin1;
	private Marin marin2;

	@Before
	public void setUp() {
		marin = new Marin("Robert");
		marin1 = new Marin("Robert", 2);
		marin2 = new Marin("Jean");
	}

	@Test
	public void testExploire() {
		Ile Elbe = new Ile("Elbe");
		assertEquals(1, marin2.visite(1, Elbe));
	}

	@Test
	public void testTotalVisiteIle() {

		Ile ile1 = new Ile("Taiti", 1);
		Ile ile2 = new Ile("Elbe", 1);

		marin.addIle(ile1);
		marin.addIle(ile2);

		assertEquals(2, marin.sizeIle());
		assertEquals(2, marin.totalVisiteIle());

	}

	@Test
	public void testUpdateGrade() {
		assertEquals(3, marin1.updateGrade(2));
	}

}
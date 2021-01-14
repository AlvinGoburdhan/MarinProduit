package StepDefinitions;

import static org.junit.Assert.assertEquals;

import Exploration.Ile;
import Exploration.Marin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_Marin_000_NombreIlesVistees {

	Marin marin;
	Marin marin1;
	private Integer value;
	private Integer value1;
	private Integer x = 2;

	@Given("Je veux ecrire un scenario qui prend en compte {string} et les iles {int} et {int}")
	public void je_veux_ecrire_un_scenario_qui_prend_en_compte_et_les_iles_et(String string, Integer int1,
			Integer int2) {

	    marin = new Marin(string);
		Ile ile1 = new Ile("Taiti", int1);
		Ile ile2 = new Ile("Elbe", int2);
		marin.addIle(ile1);
		marin.addIle(ile2);
		value = marin.totalVisiteIle();
	}

	@When("apres une exploration")
	public void apres_une_exploration() {

	}

	@Then("le {int} est calcule automatiquement")
	public void le_est_calcule_automatiquement(Integer int1) {

		assertEquals(int1, value);
	}

	@Given("Je veux ecrire un scenario qui prend en compte le {string}, son {int}  et le {int}")
	public void je_veux_ecrire_un_scenario_qui_prend_en_compte_le_son_et_le(String string, Integer int1, Integer int2) {

		marin1 = new Marin(string, int1);
		value1 = marin1.updateGrade(int2);

	}

	@When("apres un nombre total d'iles visitees superieur a {int}")
	public void apres_un_nombre_total_d_iles_visitees_egal_a(Integer int1) {

		assertEquals(x, int1);

	}

	@Then("le marin obtient un {int}")
	public void le_marin_obtient_un(Integer int1) {

		assertEquals(int1, value1);
	}
}

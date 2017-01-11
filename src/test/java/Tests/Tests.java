package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Driver.Utils;
import Steps.Steps;

public class Tests {

	private Steps steps;

	@BeforeClass(description = "Init browser")
	public void setUp() {
		steps = new Steps();


	}

	@Test
	public void fillCaseInfoPage() {
		steps.loginAmFamily(Utils.getProperty("BASE_URL"), Utils.getProperty("USERNAME"), Utils.getProperty("PASSWORD"));
		steps.startNewCase();
		steps.switchToCaseInfoFrame();
		steps.fillCaseInfoPage();
	}

	@Test
	public void fillProposedInsuredPage() {
		steps.switchToIGoFrame();
		steps.fillProposedInsured();
	}

	/*
	 * @AfterClass(description = "Stop Browser") public void stopBrowser() {
	 * steps.closeDriver(); }
	 */

}

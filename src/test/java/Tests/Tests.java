package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Steps.Steps;

public class Tests {
	
	private Steps steps;

	private final String USERNAME = "QA6612";
	private final String PASSWORD = "Password1";
	private final String BASE_URL = "https://pipepasstoigo-qd5.ipipeline.com/default.aspx?gaid=6612";

	@BeforeClass(description = "Init browser") 
	public void setUp() {
		steps = new Steps();
	}
	
	@Test 
	public void fillCaseInfoPage() {
		steps.loginAmFamily(BASE_URL, USERNAME, PASSWORD);
		steps.startNewCase();
		steps.switchToCaseInfoFrame();
		steps.fillCaseInfoPage();	
	}
	
	@Test 
	public void fillProposedInsuredPage() {
		steps.switchToIGoFrame();
		steps.fillProposedInsured();	
	}
	
/*	@AfterClass(description = "Stop Browser")
	public void stopBrowser() {
		steps.closeDriver();
	}
*/

}

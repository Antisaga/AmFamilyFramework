package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.inject.Inject;

public class LoginPage extends BasePage {
	 
	@Inject
	public LoginPage(WebDriver driverAsInput) {
		super(driverAsInput);
	}
	
	@FindBy(xpath = "//input[@name='user']")
	private WebElement user;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement submit;


	public StartPage signIn(String url, String username, String passwordKeys) {
		getDriver().get(url);
		user.sendKeys(username);
		password.sendKeys(passwordKeys);
		submit.click();
		return new StartPage(getDriver());
	}

}

package GuicePackage;

import org.openqa.selenium.WebDriver;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

import Pages.BasePage;
import Pages.CaseInfoFrame;
import Pages.CaseInfoPage;
import Pages.IGoPage;
import Pages.IGoPageFrame;
import Pages.LoginPage;
import Pages.StartPage;

public class SimpleModule extends AbstractModule{
	
	@Override
	protected void configure() {
		bind(WebDriver.class).toProvider(WebDriverProvider.class).in(Scopes.SINGLETON);
		bind(LoginPage.class);
		bind(StartPage.class);
		bind(CaseInfoFrame.class);
		bind(CaseInfoPage.class);
		bind(IGoPage.class);
		bind(IGoPageFrame.class);
	}
}

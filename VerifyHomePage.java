package TestCase;

import org.testng.annotations.Test;

import Base.BaseHook;
import Pages.LoginPage;

public class VerifyHomePage extends BaseHook {
	@Test
	public void runVerifyHomePage() {
		LoginPage lp= new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyCRMSFAIsDisplayed();
}
}
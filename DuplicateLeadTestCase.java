package TestCase;

import org.testng.annotations.Test;

import Base.BaseHook;
import Pages.LoginPage;


public class DuplicateLeadTestCase extends BaseHook{
	@Test
	public void runDuplicateLeadTestCase() throws InterruptedException {
	LoginPage lp= new LoginPage(driver);
	lp.enterUsername()
	.enterPassword()
	.clickLoginButton()
	.clickCRMSFALink()
	.clickLeadsButton()
	.clickFindLeadLink()
	.clickEmailTab()
	.enterEmailID()
	.clickFindLeadsButton()
	.captureFirstEmailID()
	.clickFirstEmailId();
}
}
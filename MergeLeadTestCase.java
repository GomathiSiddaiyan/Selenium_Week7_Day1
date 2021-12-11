package TestCase;

import org.testng.annotations.Test;

import Base.BaseHook;
import Pages.LoginPage;

public class MergeLeadTestCase extends BaseHook{
	@Test
	public void runMergeLeadTestCase() throws InterruptedException {
	LoginPage lp= new LoginPage(driver);
	lp.enterUsername()
	.enterPassword()
	.clickLoginButton()
	.clickCRMSFALink()
	.clickLeadsButton()
	.clickMergeLead()
	.clickFromLeadIcon()
	.enterFirstName()
	.clickFindLeadButton()
	.selectFirstResult()
	.clickToLeadIcon()
	.enterLastName()
	.clickFindLeadButton()
	.selectFirstResult()
	.clickMergeButton()
	.handleAlert()
	.clickFindLeadLink()
	.passLeadID()
	.clickFindLeadButton()
	.verifyMergeLeadID();
	
	}
	
}

package TestCase;

import org.testng.annotations.Test;
import Base.BaseHook;
import Pages.LoginPage;

public class CreateLeadTestCase extends BaseHook {
	
	@Test
	public void runCreateLeadTestCase() throws InterruptedException {
	LoginPage lp= new LoginPage(driver);	
	lp.enterUsername()
	.enterPassword()
	.clickLoginButton()
	.clickCRMSFALink()
	.clickLeadsButton()
	.clickCreateLead()
	.enterFirstName()
	.enterLastName()
	.enterCompanyName()
	.enterPhoneNum()
	.enterDepartment()
	.enterDescription()
	.enterEmailId()
	.selectState()
	.clickCreateLeadButton()
	.verifyFirstName();
}
}

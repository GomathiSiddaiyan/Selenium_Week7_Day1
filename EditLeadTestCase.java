package TestCase;

import org.testng.annotations.Test;

import Base.BaseHook;
import Pages.LoginPage;

public class EditLeadTestCase extends BaseHook {
	@Test
	public void runEditLeadTestCase() throws InterruptedException {
	LoginPage lp= new LoginPage(driver);
	lp.enterUsername()
	.enterPassword()
	.clickLoginButton()
	.clickCRMSFALink()
	.clickLeadsButton()
	.clickEditFindLeadLink()
	.clickPhoneTab()
	.enterPhoneNum()
	.clickFindLeadButton()
	.clickFirstResult()
	.clickEditButton()
	.enterTheChanges()
	.clickUpdateButton();
}
}
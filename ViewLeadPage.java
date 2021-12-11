package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.BaseHook;

public class ViewLeadPage extends BaseHook {
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	public MyLeadsPage verifyFirstName() {
		String MyLeadPage = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Create Lead Page TestCase-- "+MyLeadPage);
		boolean displayed = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
		return new MyLeadsPage(driver);
	}
}

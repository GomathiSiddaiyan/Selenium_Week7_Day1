package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.BaseHook;

public class HomePage extends BaseHook {

	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public void verifyCRMSFAIsDisplayed() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	public MyHomePage clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
}

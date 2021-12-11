package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.BaseHook;

public class ViewDeletePage extends BaseHook {
	public ViewDeletePage(ChromeDriver driver) {
		this.driver = driver;
	}
	public MyLeadsPage verifyDeletePhoneNum() throws InterruptedException {
		//boolean displayed = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		Thread.sleep(1000);
		String PhoneNum = driver.findElement(By.xpath("//table[@class='contactTable']//td[2]")).getText();
		System.out.println("Delete Lead Page PhoneNum-- "+leadID);
		boolean displayed =driver.findElement(By.xpath("//table[@class='contactTable']//td[2]")).isDisplayed();
		Assert.assertTrue(displayed);
		return new MyLeadsPage(driver);
	}
}

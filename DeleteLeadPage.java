package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseHook;

public class DeleteLeadPage extends BaseHook {

	public DeleteLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public DeleteLeadPage clickPhoneTab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}

	public DeleteLeadPage enterPhoneNum() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("987654321");
		return this;
	}

	public DeleteLeadPage clickFindLeadsButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}

	public DeleteLeadPage clickFirstLeadID() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String PhoneNum = driver.findElement(By.xpath("//table[@class='contactTable']//td[2]")).getText();
		System.out.println("Delete Lead Page PhoneNum-- " + PhoneNum);
		return this;
	}

	public ViewDeletePage clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
		System.out.println("Clicked on Delete Button");
		return new ViewDeletePage(driver);
	}

}

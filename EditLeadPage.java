package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseHook;

public class EditLeadPage extends BaseHook {

	public EditLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public EditLeadPage clickPhoneTab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}

	public EditLeadPage enterPhoneNum() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		return this;
	}

	public EditLeadPage clickFindLeadButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}

	public EditLeadPage clickFirstResult() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}

	public EditLeadPage clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();
		return this;
	}
	public EditLeadPage enterTheChanges() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		return this;
	}
	public EditLeadPage clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
		return this;
	}
	
}

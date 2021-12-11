package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import Base.BaseHook;

public class DuplicateLeadPage extends BaseHook {
	public String firstResultName;

	public DuplicateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public DuplicateLeadPage clickEmailTab() {
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		return this;
	}

	public DuplicateLeadPage enterEmailID() {
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("gomusidyan@gmail.com");
		return this;
	}

	public DuplicateLeadPage clickFindLeadsButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		return this;
	}

	public DuplicateLeadPage captureFirstEmailID() {
		String firstResultID = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a")).getText();
		System.out.println("First Result Lead ID: " + firstResultID);
		String firstResultName = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		System.out.println("First Result Lead Name: " + firstResultName);
		return this;
	}

	public DuplicateLeadPage clickFirstEmailId() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a")).click();
		return this;
	}

	public DuplicateLeadPage clickDuplicateLead() throws InterruptedException {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(1000);
		return this;
	}

	public DuplicateLeadPage verifyDuplicateLeadTitle() {
		String title = driver.getTitle();
		System.out.println("The title of Current page is: " + title);
		if (title.equals("Duplicate Lead | opentaps CRM")) {
			System.out.println("The title Verified is same : " + title);
		}
		return this;
	}

	public DuplicateLeadPage clickCreateLead() {
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		return this;
	}

	public DuplicateLeadPage verifyDuplicateLeadName() {
		String dup = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (dup.equals(firstResultName)) {
			System.out.println(" Duplicated Lead Name is same as First Result Lead Name");
		}
		return this;
	}

	// table[@class='contactTable']//a[@class='linktext']
}

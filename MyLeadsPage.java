package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseHook;

public class MyLeadsPage extends BaseHook {

	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);

	}
	public DuplicateLeadPage clickFindLeadLink() throws InterruptedException {
		Thread.sleep(20000);
		// driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Find Leads']")).click();
		return new DuplicateLeadPage(driver);
	}
	public EditLeadPage clickEditFindLeadLink() throws InterruptedException {
		Thread.sleep(20000);
		// driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Find Leads']")).click();
		return new EditLeadPage(driver);
	}
	public DeleteLeadPage clickFindLead() throws InterruptedException {
		Thread.sleep(20000);
		// driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Find Leads']")).click();

		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("No records to display");
		} else {
			System.out.println("There are few records to display");
		}

		return new DeleteLeadPage(driver);
	}

	public MergeLeadPage clickMergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage(driver);
	}

}

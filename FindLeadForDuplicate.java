package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseHook;

public class FindLeadForDuplicate extends BaseHook {
	public FindLeadForDuplicate(ChromeDriver driver) {
		this.driver = driver;
	}

	public DuplicateLeadPage clickFindLead() throws InterruptedException {
		Thread.sleep(20000);
		// driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Find Leads']")).click();
		return new DuplicateLeadPage(driver);
	}
}

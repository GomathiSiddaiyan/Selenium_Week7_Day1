package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import Base.BaseHook;

public class FindLeadForMerge extends BaseHook {
	public FindLeadForMerge(ChromeDriver driver) {
		this.driver = driver;
	}

	public FindLeadForMerge clickFindLeadLink() {
		driver.findElement(By.linkText("Find Leads")).click();
		return this;
	}

	@DataProvider(name = "leadID")
	public FindLeadForMerge passLeadID() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10361");
		return this;
	}

	public FindLeadForMerge clickFindLeadButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}

	public FindLeadForMerge verifyMergeLeadID() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("No records to display");
		} else {
			System.out.println("There are few records to display");
		}
		System.out.println("Merge Lead TestCase");
		return this;
	}

}

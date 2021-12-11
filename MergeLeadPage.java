package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseHook;

public class MergeLeadPage extends BaseHook {
	public MergeLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public MergeLeadPage clickFromLeadIcon() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return this;
	}

	public MergeLeadPage enterFirstName() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Gomathi");
		return this;

	}

	public MergeLeadPage clickFindLeadButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		return this;
	}

	public MergeLeadPage selectFirstResult() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
		return this;
	}

	public MergeLeadPage clickToLeadIcon() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		return this;
	}

	public MergeLeadPage enterLastName() {
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Siddaiyan");
		return this;
	}

	public MergeLeadPage clickMergeButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		return this;
	}

	public FindLeadForMerge handleAlert() {
		driver.switchTo().alert().accept();
		return new FindLeadForMerge(driver);
	}
}

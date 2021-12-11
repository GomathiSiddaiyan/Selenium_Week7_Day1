package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Base.BaseHook;

public class CreateLeadPage extends BaseHook {

	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gomathi");
		return this;
	}

	public CreateLeadPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		return this;
	}

	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		return this;
	}

	public CreateLeadPage enterPhoneNum() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("987654321");
		return this;
	}

	public CreateLeadPage enterEmailId() {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gomusidyan@gmail.com");
		return this;
	}

	public CreateLeadPage enterDepartment() {
		driver.findElement(By.name("departmentName")).sendKeys("CSE");
		return this;

	}

	public CreateLeadPage enterDescription() {
		driver.findElement(By.name("description")).sendKeys("Hi i am Gomathi");
		return this;
	}

	public CreateLeadPage selectState() throws InterruptedException {
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateName = new Select(state);
		stateName.selectByVisibleText("New York");
		Thread.sleep(1000);
		return this;
	}

	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}

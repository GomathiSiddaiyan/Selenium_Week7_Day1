package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseHook;

public class MyHomePage extends BaseHook {
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public MyLeadsPage clickLeadsButton() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);

	}
}

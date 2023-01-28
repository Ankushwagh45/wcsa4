package testNG02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
	static WebDriver driver;

	@Test(description = "djsjsbekb")
	public void sql() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://ankush/login.do");
		Thread.sleep(1000);

		driver.findElement(By.name("username")).sendKeys("admin");
		
		Reporter.log("bhosdiwale chacha",true);

	}
}

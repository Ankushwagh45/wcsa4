package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");

		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123", Keys.ENTER);

		Thread.sleep(10000);
		driver.navigate().back();

		Thread.sleep(5000);
		driver.navigate().forward();
	}

}

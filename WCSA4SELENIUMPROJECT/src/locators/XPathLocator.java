package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://ankush/login.do");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[@class='logout']")).click();
		Thread.sleep(5000);

		driver.close();
	}

}

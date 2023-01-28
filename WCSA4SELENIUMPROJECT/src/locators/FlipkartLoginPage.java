package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("9130387384");
		Thread.sleep(2000);
		/*driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("12344",Keys.ENTER);;*/
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3NgS1a']")).click();
	}
}

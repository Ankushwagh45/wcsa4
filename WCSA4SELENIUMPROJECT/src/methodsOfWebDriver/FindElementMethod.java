package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://ankush/login.do");
		Thread.sleep(2000);

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager", Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[.='Logout']")).click();
		Thread.sleep(2000);

		System.out.println(username);
		System.out.println(password);

		Thread.sleep(5000);
		driver.close();
	}

}

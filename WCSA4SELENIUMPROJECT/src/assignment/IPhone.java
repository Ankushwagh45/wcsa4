package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPhone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("iphone 14pro max", Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Thread.sleep(2000);

		String childWindow = driver.getWindowHandle();
		driver.switchTo().window(childWindow);

		driver.findElement(By.xpath("//a[.='128 GB']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("411033");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[.='Remove']")).click();
		Thread.sleep(2000);

		driver.findElement(By.className("_3dsJAO _24d-qY FhkMJZ")).click();

	}

}

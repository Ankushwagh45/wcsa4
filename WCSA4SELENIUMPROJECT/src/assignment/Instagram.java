package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().to("https://www.instagram.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("ia_ankush45");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Ankush@0121",Keys.ENTER);
		
		
		
	}

}

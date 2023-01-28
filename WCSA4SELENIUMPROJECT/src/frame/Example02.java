package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example02 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/ankus/OneDrive/Desktop/WCSA4/Frame01.html");
		//Thread.sleep(2000);
		
		driver.switchTo().frame("abc");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Ankush@0121");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email1")).sendKeys("ankush1000@gmail.com");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("usr")).sendKeys("ankush117");
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}

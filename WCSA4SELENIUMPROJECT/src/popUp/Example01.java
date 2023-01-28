package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox?compose=new");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ankushwagh1000@gmail.com",Keys.ENTER);
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath(""))
		
	}

}

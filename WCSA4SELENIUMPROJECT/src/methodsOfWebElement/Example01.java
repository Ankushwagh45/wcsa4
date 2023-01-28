package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().to("file:///C:/Users/ankus/OneDrive/Desktop/WCSA4/WebElement.html");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("password"));
		
		boolean status;
		boolean status01;
		if(status=username.isEnabled())
		{
			username.sendKeys("Ankush117");
		}
		else if(status01=password.isEnabled())
		{
			password.sendKeys("Ankush@0121");
		}
		else
		{
			driver.close();
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}

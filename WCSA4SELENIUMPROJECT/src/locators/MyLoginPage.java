package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ankus/OneDrive/Desktop/WCSA4/TextBox.html");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("Ankush117");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("A1B2C3D4");
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		driver.close();
	
	}

}

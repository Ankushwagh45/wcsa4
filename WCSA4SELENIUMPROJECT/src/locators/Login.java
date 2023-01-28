package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.navigate().to("file:///C:/Users/ankus/OneDrive/Desktop/WCSA4/TextBox.html");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Ankush117");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Password");
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}

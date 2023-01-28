package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ankus/OneDrive/Desktop/WCSA4/ForgotPassord.html");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.tagName("input")).sendKeys("ankushwagh1000@gmail.com");
		
		Thread.sleep(2000);
		driver.close();
		
	}

}

package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelDisabledWebElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().to("file:///C:/Users/ankus/OneDrive/Desktop/WCSA4/DisabledWebElement.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('12').value='admin';");
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}

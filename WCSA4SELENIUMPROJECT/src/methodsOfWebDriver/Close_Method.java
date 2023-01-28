package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		driver.findElement(By.xpath("//a[.='open a popup window']")).click();
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.close();
		}

}

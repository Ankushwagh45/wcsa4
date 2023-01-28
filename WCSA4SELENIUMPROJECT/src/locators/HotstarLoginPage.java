package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotstarLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in");
		Thread.sleep(2000);
		driver.findElement(By.className("signIn")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("form-control")).sendKeys("9130387384",Keys.ENTER);
		
}
}
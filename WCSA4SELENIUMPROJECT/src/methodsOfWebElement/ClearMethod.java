package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		driver.findElement(By.className("signIn")).click();
		Thread.sleep(4000);
		WebElement usr = driver.findElement(By.className("form-control"));
		Thread.sleep(2000);
		
		usr.sendKeys("9130387384");
		Thread.sleep(5000);
		
		usr.clear();
		
		
	}

}

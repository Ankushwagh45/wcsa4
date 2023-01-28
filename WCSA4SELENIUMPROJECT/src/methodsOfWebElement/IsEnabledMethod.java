package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
			driver.get("https://www.instagram.com");
			Thread.sleep(2000);
			
			driver.findElement(By.name("username")).sendKeys("iam_ankush45");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("A1B2C3D4");
			Thread.sleep(2000);
			
			WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class,' _aijb _acas _aj1-')]"));
			boolean status = loginButton.isEnabled();
			System.out.println(status);
		}

}

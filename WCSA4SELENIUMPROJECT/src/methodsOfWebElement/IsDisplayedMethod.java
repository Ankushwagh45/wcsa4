package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("http://ankush/login.do");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.className("initial"));
		boolean status = loginButton.isDisplayed();
		System.out.println(loginButton);
		
		Thread.sleep(4000);
		driver.close();
		
	}

}

package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ankush/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		WebElement usr = driver.findElement(By.linkText("License for using this software"));
		String text = usr.getText();
		System.out.println(text);

		Thread.sleep(2000);
		driver.close();
	}

}

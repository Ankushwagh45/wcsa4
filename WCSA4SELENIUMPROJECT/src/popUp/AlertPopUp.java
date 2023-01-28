package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().to("file:///C:/Users/ankus/OneDrive/Desktop/WCSA4/AlertPopUp.html");
		Thread.sleep(2000);

		WebElement button = driver.findElement(By.xpath("//button[.='click me! ']"));
		button.click();

		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);

		// al.accept();
		String text = al.getText();
		System.out.println(text);

		// Thread.sleep(2000);
		// driver.close();
	}

}

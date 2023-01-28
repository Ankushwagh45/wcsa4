package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().to("file:///C:/Users/ankus/OneDrive/Desktop/WCSA4/ConfirmationPopUp.html");
		Thread.sleep(2000);

		WebElement button = driver.findElement(By.xpath("//button[.='click me! ']"));
		button.click();

		Thread.sleep(2000);

		Alert al = driver.switchTo().alert();

		Thread.sleep(2000); // al.accept();

		// button.click();

		Thread.sleep(2000); // al.dismiss();
		String text = al.getText();
		System.out.println(text);

	}

}

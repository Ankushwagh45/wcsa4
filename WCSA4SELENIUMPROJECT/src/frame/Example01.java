package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().to("https://www.bluestone.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='confirm-btn']")).click();
		Thread.sleep(2000);

		driver.switchTo().frame("fc_widget");
		// driver.switchTo().frame(6);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='chat-icon']")).click();

	}

}

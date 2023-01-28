package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@class='yt-simple-endpoint style-scope ytd-mini-guide-entry-renderer'])[2]"))
				.click();
		Thread.sleep(2000);

		List<WebElement> a = driver.findElements(By.xpath(
				"//div[@class='style-scope ytd-reel-player-overlay-renderer']/ancestor::div[@class='overlay style-scope ytd-reel-video-renderer']"));

		for (WebElement opt : a) {
			String b = opt.getText();
			Thread.sleep(2000);

			System.out.println(b);
			System.out.println("======================");

		}

	}

}

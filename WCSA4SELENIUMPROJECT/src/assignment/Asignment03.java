package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Asignment03 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().to("http://jqueryui.com/droppable/");

		WebElement src = driver.findElement(By.xpath("//div[contains(@class,'handle')]"));

		WebElement target = driver.findElement(By.xpath("//div[contains(@class,'droppable')]"));

		Thread.sleep(2000);

		Actions act = new Actions(driver);

		act.doubleClick(src).perform();

		act.dragAndDrop(src, target).perform();

	}

}

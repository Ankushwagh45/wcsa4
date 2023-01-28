package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example05 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2000);

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		Set<String> allWindow = driver.getWindowHandles();
		for (String wh : allWindow) {
			if (!parentWindow.equals(wh)) {
				WebDriver childWindow = driver.switchTo().window(wh);
				childWindow.manage().window().maximize();
				Thread.sleep(2000);
				childWindow.close();
			}
			Thread.sleep(3000);
			driver.close();

		}
	}

}

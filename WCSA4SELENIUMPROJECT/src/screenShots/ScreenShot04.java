package screenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

@SuppressWarnings("deprecation")
public class ScreenShot04 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		EventFiringWebDriver eft = new EventFiringWebDriver(driver);
		
		eft.manage().window().maximize();

		eft.get("https://www.hotstar.com");

		File src = eft.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/A05.png");
		Files.copy(src, dest);

		Thread.sleep(2000);
		eft.close();
	}

}

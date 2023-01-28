package screenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot03 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		TakesScreenshot tcs = driver;

		driver.get("http://ankush/login.do");

		File src = tcs.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/S03.png");
		Files.copy(src, dest);

		Thread.sleep(2000);
		driver.close();

	}

}

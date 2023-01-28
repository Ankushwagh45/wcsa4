package screenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShot02 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		RemoteWebDriver rmd = (RemoteWebDriver) driver;

		rmd.get("http://ankush/login.do");

		File src = rmd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/A08.png");
		Files.copy(src, dest);

		Thread.sleep(2000);
		rmd.close();
	}

}

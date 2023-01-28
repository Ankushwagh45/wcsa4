package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShot05 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		RemoteWebDriver rft=new ChromeDriver();
		
		rft.manage().window().maximize();
		rft.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		rft.navigate().to("https://www.selenium.dev");
		
		File src = rft.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/A03.png");
		
		Thread.sleep(2000);
		Files.copy(src, dest);
		
		Thread.sleep(2000);
		rft.close();
		
		
	}

}

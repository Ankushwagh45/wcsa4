package keyWordDriverFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginPage {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Flib flib = new Flib();

		String url = flib.readPropertyData("./testData/config.properties", "Url");

		String username = flib.readPropertyData("./testData/config.properties", "Username");

		String password = flib.readPropertyData("./testData/config.properties", "Password");

		driver.get(url);

		Thread.sleep(1000);

		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(1000);

		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(1000);

		driver.findElement(By.id("loginButton")).click();

	}

}

package testNG02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadBrowser {
	static WebDriver driver;

	@Test
	@Parameters("browser")
	public void openBrowse(String browserValue) {
		if (browserValue.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("http://ankush/login.do");

		} else {
			System.out.println("enter valid browser");

		}

	}
}

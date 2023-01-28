package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

   
public class Quit_Method {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.paytm.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
		
	}
}

package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ankus/OneDrive/Desktop/WCSA4/TextBox.html");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		driver.close();
	}

}

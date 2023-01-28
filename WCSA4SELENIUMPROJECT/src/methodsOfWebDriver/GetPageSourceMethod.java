package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ankus/OneDrive/Desktop/WCSA4/TextBox.html");
		driver.manage().window().maximize();
		System.out.println(driver.getPageSource());
		Thread.sleep(4000);
		driver.close();
	}

}

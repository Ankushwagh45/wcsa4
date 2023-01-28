package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title_Method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.paytm.com");
		driver.manage().window().maximize();
		String titleOfWebPage = driver.getTitle();
		System.out.println(titleOfWebPage);
		Thread.sleep(4000);
		driver.close();
		 
	}

}

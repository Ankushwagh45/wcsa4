package qsp;
import java.util.Scanner;

// Launch the Chrome Browser
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		Scanner scn = new Scanner(System.in);
	
		System.out.println("Which Web Page U Want to Open");
		String url = scn.next();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		driver.close();
	}
}

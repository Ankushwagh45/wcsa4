package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 
		 driver.get("https://omayo.blogspot.com/");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.linkText("Open a popup window")).click();
		 
		 String parentWindow = driver.getWindowHandle();
		 System.out.println(parentWindow);
		 
		 System.out.println("===============");
		 
		 Set<String> allWindow = driver.getWindowHandles();
		 for(String wh:allWindow)
		 {
			 System.out.println(wh);
		 }
		 Thread.sleep(2000);
		 driver.quit();
	}

}

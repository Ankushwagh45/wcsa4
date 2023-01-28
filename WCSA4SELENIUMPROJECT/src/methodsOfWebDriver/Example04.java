package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example04 {
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
		 
		 Set<String> allWindow = driver.getWindowHandles();
		 for(String wh:allWindow)
		 {
			 if(!parentWindow.equals(wh))
			 {
				 driver.switchTo().window(wh).close();
			 }
		 }
		 
	}

}

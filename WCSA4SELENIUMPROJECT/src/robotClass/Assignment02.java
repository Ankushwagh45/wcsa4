package robotClass;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment02 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().to("http://ankush/login.do");
		Thread.sleep(2000);
		
		WebElement target = driver.findElement(By.xpath("//td[@class='header']"));
		
		Actions act = new Actions(driver);
		for(int i=0;i<=2;i++)
		{
			act.clickAndHold(target).perform();
		}
	
	}

}

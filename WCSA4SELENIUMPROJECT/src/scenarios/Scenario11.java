package scenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().to("https://www.bluestone.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Allow']")).click();
		Thread.sleep(2000);
		
		WebElement target = driver.findElement(By.xpath("//span[.='Offers ']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//span[contains(.,'Up to 50% Off On Making Charges')]")).click();
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.xpath("//li[contains(@class,' with-discount')]"));
		Thread.sleep(2000);
		
		for(WebElement opt:options)
		{
			String name = opt.getText();
			Thread.sleep(2000);
			
			System.out.println(name);
			System.out.println("==================");
		}
		
		
	}

}

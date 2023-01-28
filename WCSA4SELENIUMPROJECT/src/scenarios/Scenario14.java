package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario14 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().to("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='confirm-btn']")).click();
		Thread.sleep(2000);
		
		WebElement target = driver.findElement(By.xpath("//li[@id='goldCoins']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("(//span[.='1 gram'])[3]")).click();
		Thread.sleep(2000);
		
		WebElement coin = driver.findElement(By.xpath("//div[@class='mousetrap']"));
		boolean status;
		if(status=coin.isDisplayed())
		{
			System.out.println("1 gram  Gold coin is Displayig");
		}
		else
		{
			System.out.println("1 gram  Gold coin is not Displaying");
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}

}

package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://ankush/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@class,' administration')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[contains(@name,'formCustomInterfaceLogo.logoOption')])[2]")).click();
		Thread.sleep(2000);
		
		
		WebElement target = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(target).perform();
		
		
		
		
		
		
	}

}

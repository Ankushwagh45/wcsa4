package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("file:///C:/Users/ankus/OneDrive/Desktop/WCSA4/Multiselectdropdown.html");
		
		WebElement select = driver.findElement(By.xpath("//option[.='samosa']"));
		
		WebElement option = driver.findElement(By.xpath("//option[@value='v5']"));
		
		if(select ==option)
		{
		   select.click();
		}
		else
		{
			System.out.println(select);
		}
	
	}

}

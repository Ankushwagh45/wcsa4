package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("file:///C:/Users/ankus/OneDrive/Desktop/WCSA4/DropDown.html");
		
		WebElement dropDown = driver.findElement(By.name("chkbox"));
		
		Select sel = new Select(dropDown);
		
		boolean status = sel.isMultiple();
		
		System.out.println(status);
		
		Thread.sleep(4000);
		driver.close();
	}

}

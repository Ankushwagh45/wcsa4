package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("file:///C:/Users/ankus/OneDrive/Desktop/WCSA4/DropDown.html");
		
		WebElement dropdown = driver.findElement(By.name("chkbox"));
		
		Select sel = new Select(dropdown);
		Thread.sleep(4000);
		sel.selectByIndex(6);
		Thread.sleep(4000);
		
		sel.deselectByIndex(6);
		Thread.sleep(4000);
		driver.close();
		
	}

}

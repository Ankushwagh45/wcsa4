package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/ankus/OneDrive/Desktop/WCSA4/Multiselectdropdown.html");
		
		WebElement AllOptions = driver.findElement(By.id("menu"));
		
		Select sel = new Select(AllOptions);
		
		for(int i=0;i<=6;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		List<WebElement> options = sel.getAllSelectedOptions();
		for(WebElement opt:options)
		{
			String values = opt.getText();
			Thread.sleep(2000);
			System.out.println(values);
		}
		
		
		
	}

}

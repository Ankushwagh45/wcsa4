package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashSet {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/ankus/OneDrive/Desktop/WCSA4/Multiselectdropdown.html");
		
		WebElement dropDown = driver.findElement(By.id("menu"));
	
		Select sel = new Select(dropDown);
		List<WebElement> options = sel.getOptions();
		
		java.util.HashSet<String> s = new java.util.HashSet<String>();
		
		for(int i=0;i<options.size();i++)
		{
			WebElement opts = options.get(i);
			String values = opts.getText();
			
			s.add(values);
		}
		for(String option:s)
		{
			System.out.println(option);
		}
		
	}

}

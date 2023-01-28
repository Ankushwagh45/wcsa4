package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://ankush/login.do");
		
		WebElement Selected = driver.findElement(By.name("remember"));
		boolean s1 = Selected.isSelected();
		System.out.println(s1);
		Thread.sleep(2000);
		Selected.click();
		Thread.sleep(4000);
		boolean s2 = Selected.isSelected();
		System.out.println(s2);
	}

}

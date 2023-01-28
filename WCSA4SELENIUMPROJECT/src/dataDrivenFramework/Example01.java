package dataDrivenFramework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example01 {
	public static void main(String[] args) 
	{

		Flib flib = new Flib();
		flib.setPath();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://ankush/login.do");

	}

}

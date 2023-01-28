package xPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ankush/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"loginBox\"]/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td[2]/input")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[3]/a")).click();
		Thread.sleep(5000);
		
		driver.close();
	}

}

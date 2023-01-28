package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvalidLoginCread {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://ankush/login.do");
		
		Flib flib = new Flib();
		
		int rc = flib.rowCount("./testData/ActiTime.xlsx","invalid");
		for(int i=0;i<rc;i++)
		{
			String username = flib.readExcelData("./testData/ActiTime.xlsx","invalid",i,0);
			
			String password = flib.readExcelData("./testData/ActiTime.xlsx","invalid",i,1);
			
			driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(1000);
			
			driver.findElement(By.name("pwd")).sendKeys(password);
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("loginButton")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.name("username")).clear();
			
			
		}
	}

}

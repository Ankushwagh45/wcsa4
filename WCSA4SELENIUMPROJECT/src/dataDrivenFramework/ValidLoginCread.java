package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginCread {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://ankush/login.do");
		
		Flib flib = new Flib();
		
		String username = flib.readExcelData("./testData/ActiTime.xlsx","valid",1 ,0);
		
		String password = flib.readExcelData("./testData/ActiTime.xlsx","valid",1, 1);
		
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys(password,Keys.ENTER);
	}

}

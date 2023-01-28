package testNG02;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pageObjectModel.Flib;

public class ActiTimeValidCread extends BaseTest {
  @Test
  public void login() throws IOException, InterruptedException
  {
	 BaseTest bt = new BaseTest();
	 bt.openBrowser();
	 
	 Flib flib = new Flib();
	 
	String usn = flib.readPropertyData(PROP_PATH, "Username");
	String pwd = flib.readPropertyData(PROP_PATH, "Password");
	
	driver.findElement(By.name("username")).sendKeys(usn);
	Thread.sleep(1000);
	
	driver.findElement(By.name("pwd")).sendKeys(pwd,Keys.ENTER);
	  
  }
}

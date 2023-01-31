package dynamicScreenShot;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListner.class)

public class ValidLogin extends BaseTest {
	
	@BeforeMethod
	public void setUp()
	{
		initializtion();
	}
	
	
	@Test
	public void validLogin()
	{
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,"tanmay");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
	}

}

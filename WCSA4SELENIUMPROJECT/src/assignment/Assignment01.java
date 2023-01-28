package assignment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {
	private static final Class<? extends Throwable> login = null;
	WebDriver driver;

	@Before
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ankush/login.do");
		Thread.sleep(2000);

	}

	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);

		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		Thread.sleep(5000);

	}

/*	@Test(expected = "login")
	public void logOut() {
		driver.findElement(By.className("logout")).click();*/
	}



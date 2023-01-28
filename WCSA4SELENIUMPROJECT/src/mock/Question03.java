package mock;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question03 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://accounts.nike.com/lookup?client_id=4fd2d5e7db76e0f85a6bb56721bd51df&redirect_uri=https://www.nike.com/auth/login&response_type=code&scope=openid%20nike.digital%20profile%20email%20phone%20flow%20country&state=f1151fcf5ca242969d1b9346489650f3&code_challenge=bZc8md-9xV0VvPj9wthWuArAGlEBvVqgDeoGRlcoPU0&code_challenge_method=S256");
		Thread.sleep(2000);
		
		
		WebElement user = driver.findElement(By.name("credential"));
		Thread.sleep(2000);
		user.sendKeys("ankushwagh1000@gmail.com");
		
		Thread.sleep(4000);
		user.clear();
		
		
		
		
		

	}

}

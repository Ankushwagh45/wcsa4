package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("HP Laptop");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[3]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='_2gmUFU _3V8rao'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[7]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_2gmUFU _3V8rao'])[5]")).click();
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[10]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='_2gmUFU _3V8rao'])[13]")).click();
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[12]")).click();

		Thread.sleep(3000);

		String price = driver.findElement(By.xpath(
				"(//div[@class='_4rR01T'])[1]/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"))
				.getText();
		
		System.out.println("Price Of Laptop is: "+price);
		
		Thread.sleep(5000);
		driver.close();

	}

}

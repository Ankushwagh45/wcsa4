package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamsungMobile {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung mobiles");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		// Thread.sleep(2000);

		String price = driver.findElement(By.xpath(
				"//div[.='SAMSUNG Galaxy F22 (Denim Black, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"))
				.getText();

		System.out.println("price of the mobile:" + price);

		Thread.sleep(5000);
		driver.quit();

	}

}

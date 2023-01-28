package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HpLaptop01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Hp Laptop",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Core i7']/preceding-sibling::input[@class='_30VH1S']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::input[@class='_30VH1S']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Windows 10']/preceding-sibling::input[@class='_30VH1S']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='4★ & above']/preceding-sibling::input[@class='_30VH1S']")).click();
		Thread.sleep(2000);
		String price = driver.findElement(By.xpath("//div[.='HP Pavilion Ryzen 5 Hexa Core AMD R5-5600H - (8 GB/512 GB SSD/Windows 10/4 GB Graphics/NVIDIA GeForce ...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println("Price of the laptop is: "+price);
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}

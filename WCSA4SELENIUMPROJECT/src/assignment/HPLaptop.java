package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HPLaptop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Hp Ryzen5 Laptop");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(5000);
		
		String price = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		
		System.out.println("Price of the laptop is: "+price);
		
		Thread.sleep(5000);
		WebElement a=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		String s = a.getAttribute("value");
		System.out.println(s);
		//driver.findElement(By.)
		driver.close();
	}

}

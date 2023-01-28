package qsp;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphisam {
		public static void main(String[] args) throws InterruptedException {
			Scanner scn = new Scanner(System.in);
			System.out.println("Which Browser U want to Open:");
			String browserValue = scn.next();
			
			if (browserValue.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https:/www.instagram.com");
				WebElement userName = driver.findElement(By.id("Password"));
				userName.sendKeys("Ankush117");
				Thread.sleep(5000);
				driver.close();	
				
			}
			else if(browserValue.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				
				FirefoxDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://web.whatsapp.com");
				Thread.sleep(5000);
				driver.close();
			}
			else if(browserValue.equalsIgnoreCase("Edge"))
			{
				System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
				
				EdgeDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com");
				Thread.sleep(5000);
				driver.close();
			}
			else
			{
				System.out.println("Enter the Correct Browser Name");
			}
		}
}

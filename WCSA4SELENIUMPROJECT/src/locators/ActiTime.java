package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ankush/login.do");
		Thread.sleep(2000);

		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);

		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);

		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);

		/*
		 * driver.findElement(By.linkText("Tasks")).click(); Thread.sleep(2000);
		 * driver.findElement(By.linkText("Projects & Customers")).click();
		 * Thread.sleep(2000);
		 * 
		 * /*driver.findElement(By.cssSelector("input[value='Create New Customer']")).
		 * click(); Thread.sleep(2000);
		 * driver.findElement(By.name("name")).sendKeys("PhonePay03");
		 * Thread.sleep(2000);
		 * driver.findElement(By.name("createCustomerSubmit")).click();
		 * Thread.sleep(4000);
		 * 
		 * driver.findElement(By.cssSelector("input[value='Create New Project']")).click
		 * (); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.name("customerId")).click(); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.cssSelector("option[value='14']")).click();
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.name("name")).sendKeys("Robotics1.2",Keys.ENTER);
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.cssSelector("td[id='projectNameCell16']")).click();
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.name("task[0].name")).sendKeys("Write System Test Case"
		 * ); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.cssSelector("input[value='Create Tasks']")).click();
		 * //driver.close();
		 * 
		 * driver.findElement(By.name("customers[10]")).click(); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.name("customers[14]")).click(); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.name("customers[15]")).click(); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.name("customers[12]")).click(); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.cssSelector("input[value='Delete Selected']")).click();
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.cssSelector("input[value='Delete These Customers']")).
		 * click();
		 */

		driver.findElement(By.linkText("Users")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[value='Create New User']")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("username")).sendKeys("Manager");
		Thread.sleep(2000);

		driver.findElement(By.name("passwordText")).sendKeys("45");
		Thread.sleep(2000);

		driver.findElement(By.name("passwordTextRetype")).sendKeys("45");
		Thread.sleep(2000);

		driver.findElement(By.name("firstName")).sendKeys("ABC");
		Thread.sleep(2000);

		driver.findElement(By.name("middleName")).sendKeys("JKL");
		Thread.sleep(2000);

		driver.findElement(By.name("lastName")).sendKeys("XYZ");
		Thread.sleep(2000);

		driver.findElement(By.name("overtimeTracking")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("overtimeTrackingLevel")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("releaseDateStr")).sendKeys("Dec 05,2023");
		Thread.sleep(2000);

		driver.findElement(By.name("rightGranted[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("rightGranted[1]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='rightGranted[5]']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='rightGranted[7]']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='rightGranted[10]']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='rightGranted[11]']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='rightGranted[12]']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[value='   Create User   ']")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector("a[class='logout']")).click();
		Thread.sleep(5000);

		driver.findElement(By.name("username")).sendKeys("Manager");
		Thread.sleep(2000);

		driver.findElement(By.name("pwd")).sendKeys("45");
		Thread.sleep(2000);

		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);

		driver.findElement(By.linkText("Tasks")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[@name='customerId']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//option[@value='8']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[@name='projectId']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//option[@value='13']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='task[0].name']")).sendKeys("Write Integration Test Cases");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[@name='task[0].billingType']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//option[@value='1']")).click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("//input[@name='task[0].markedToBeAddedToUserTasks']")).click();
		// Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		Thread.sleep(2000);

		// driver.findElement(By.linkText("Tasks")).click();
		// Thread.sleep(2000);

		driver.findElement(By.linkText("Users")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[value='Create New User']")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("username")).sendKeys("Test Engg01");
		Thread.sleep(2000);

		driver.findElement(By.name("passwordText")).sendKeys("45");
		Thread.sleep(2000);

		driver.findElement(By.name("passwordTextRetype")).sendKeys("45");
		Thread.sleep(2000);

		driver.findElement(By.name("firstName")).sendKeys("Ankush");
		Thread.sleep(2000);

		driver.findElement(By.name("middleName")).sendKeys("Laxman");
		Thread.sleep(2000);

		driver.findElement(By.name("lastName")).sendKeys("Wagh");
		Thread.sleep(2000);

		driver.findElement(By.name("overtimeTracking")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("overtimeTrackingLevel")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("releaseDateStr")).sendKeys("Dec 13,2023");
		Thread.sleep(2000);

		driver.findElement(By.name("rightGranted[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("rightGranted[1]")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector("input[value='   Create User   ']")).click();
		Thread.sleep(5000);

		// driver.findElement(By.cssSelector("a[class='logout']")).click();
		// Thread.sleep(5000);

		driver.findElement(By.linkText("Time-Track")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("option[value='28']")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Insert existing tasks")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[name='selected_14']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[value='Insert Selected Tasks to the Enter Time-Track Page']")).click();
		Thread.sleep(2000);

		/*
		 * driver.findElement(By.name("username")).sendKeys("Test Engg01");
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.name("pwd")).sendKeys("45"); Thread.sleep(2000);
		 * 
		 * driver.findElement(By.id("loginButton")).click(); Thread.sleep(5000);
		 * 
		 * 
		 * 
		 * 
		 * driver.findElement(By.className("logout")).click(); Thread.sleep(5000);
		 * 
		 * `driver.close();
		 */
		
		

	}
}

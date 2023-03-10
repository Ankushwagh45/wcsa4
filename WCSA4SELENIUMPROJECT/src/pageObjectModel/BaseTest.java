package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant{
	
		static WebDriver driver;
		
		public void openBrowser() throws IOException
		{
			Flib flib = new Flib();
			
			String url = flib.readPropertyData(PROP_PATH, "Url");
			String browserValue = flib.readPropertyData(PROP_PATH, "Browser");
			
			if(browserValue.equals("chrome"))
			{
				System.setProperty(CHROME_KEY, GECKO_VALUE);
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get(url);
			}
			else if(browserValue.equals("firefox"))
			{
				System.setProperty(GECKO_KEY,GECKO_VALUE);
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get(url);
			}
			else if(browserValue.equals("msedge"))
			{
				System.setProperty(EDGE_KEY, EDGE_VALUE);
				driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get(url);
				
			}
			else
			{
				System.out.println("Enter Valid Browser Name");
			}
			
		}
		public void closeBrowser()
		{
			driver.quit();
		}
}

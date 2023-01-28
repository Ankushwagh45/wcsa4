package keyWordDriverFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TestData01 extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bc = new BaseTest();

		bc.openBrowser();

		Flib flib = new Flib();

		String username = flib.readExcelData(EXCEL_PATH,"valid", 1, 0);
		String password = flib.readExcelData(EXCEL_PATH,"valid", 1, 1);

		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(1000);

		driver.findElement(By.name("pwd")).sendKeys(password, Keys.ENTER);
		Thread.sleep(2000);
		
		bc.closeBrowser();

	}
	

}

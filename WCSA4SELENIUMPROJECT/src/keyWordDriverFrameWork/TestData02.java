package keyWordDriverFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TestData02 extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();

		bt.openBrowser();

		Flib flib = new Flib();

		int rc = flib.rowCount(EXCEL_PATH, "invalid");

		for (int i = 0; i <= rc; i++) {
			String username = flib.readExcelData(EXCEL_PATH, "invalid", i, 0);
			String password = flib.readExcelData(EXCEL_PATH, "invalid", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(1000);

			driver.findElement(By.name("pwd")).sendKeys(password, Keys.ENTER);
			Thread.sleep(1000);

			driver.findElement(By.name("username")).clear();

		}

	}

}

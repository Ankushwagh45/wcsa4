package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public void setPath() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	}

	public String readExcelData(String sheetPath, String sheetName, int rowCount, int cellCount)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(sheetPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();

		return data;
	}

	public int rowCount(String sheetPath, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(sheetPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();

		return rc;
	}

	public void writeExcelData(String sheetPath, String sheetName, int rowCount, int cellCount, String data)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(sheetPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.createCell(cellCount);

		cell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(sheetPath);
		wb.write(fos);

	}

}

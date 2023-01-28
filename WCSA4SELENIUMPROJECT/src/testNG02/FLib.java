package testNG02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FLib {
	@BeforeMethod
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
	@BeforeMethod
	public int rowCount(String sheetPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(sheetPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		
		return rc;
		
		
	}
	@BeforeMethod
	public String readPropertyData(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String data = prop.getProperty(key);
		
		return data;
		
		
		
	}
}

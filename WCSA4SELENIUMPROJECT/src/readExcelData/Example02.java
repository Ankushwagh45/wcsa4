package readExcelData;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import dataDrivenFramework.Flib;

public class Example02 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		Flib flib = new Flib();
		
		flib.writeExcelData("./testData/ActiTime.xlsx","valid", 0, 2,"Link");
	}

}

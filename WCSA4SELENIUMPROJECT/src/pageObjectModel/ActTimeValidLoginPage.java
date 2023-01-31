package pageObjectModel;

import java.io.IOException;

public class ActTimeValidLoginPage extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		ActTimeValidLoginCread ac = new ActTimeValidLoginCread(driver);
		
		Flib flib = new Flib();
		
		String usn = flib.readExcelData(EXCEL_PATH, "valid",1, 0);
		String pwd = flib.readExcelData(EXCEL_PATH, "valid",1, 1);
		
		ac.actiTimeValidLoginCread(usn, pwd);
		
		
		
	}
	

}

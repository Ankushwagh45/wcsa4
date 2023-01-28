package pageObjectModel;

import java.io.IOException;

public class ActiTimeInvalidLogin extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		ActTimeValidLoginCread act = new ActTimeValidLoginCread(driver);
		
		Flib flib = new Flib();
		
		int rc = flib.rowCount(EXCEL_PATH, "invalid");
		
		for(int i=1;i<=rc;i++)
		{
			String usn = flib.readExcelData(EXCEL_PATH, "invalid",i,0);
			String pwd = flib.readExcelData(EXCEL_PATH, "invalid",i,1);
			
			act.actiTimeInvalidLoginCread(usn, pwd);
		}
		
	}

}

package pageObjectModel;

import java.io.IOException;

public class Logout extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		
		bt.openBrowser();
		
		ActTimeValidLoginCread act = new ActTimeValidLoginCread(driver);
		
		Flib flib = new Flib();
		
		String usn = flib.readPropertyData(PROP_PATH, "Username");
		//Thread.sleep(1000);
		
		String pwd = flib.readPropertyData(PROP_PATH, "Password");
		
		act.actiTimeValidLoginCread(usn, pwd);
		
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		hp.selectUSer(1);
		Thread.sleep(2000);
		
		hp.logout();
		
		Thread.sleep(2000);
		bt.closeBrowser();
		
		
		
	}

}

package pageObjectModel;

import java.io.IOException;

public class CreateUser extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		bt.openBrowser();

		ActTimeValidLoginCread act = new ActTimeValidLoginCread(driver);

		Flib flib = new Flib();

		String usn = flib.readPropertyData(PROP_PATH, "Username");
		String pwd = flib.readPropertyData(PROP_PATH, "Password");

		act.actiTimeValidLoginCread(usn, pwd);

		Thread.sleep(2000);

		HomePage hp = new HomePage(driver);

		hp.users();
	}

}

package testNG02;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void login() 
  {
	  Reporter.log("log in is done",true);
  }
  @Test(dependsOnMethods ="login")
  public void createUSer() 
  {
	  Reporter.log("User Created",true);
  }
  
	  @Test(dependsOnMethods = "createUSer")
	  public void logOut() 
	  {
		  Reporter.log("LogOut");
	  }
}

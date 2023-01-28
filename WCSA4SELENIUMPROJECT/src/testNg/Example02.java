package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example02 {
  @Test
  public void sumo()
  {
	  Reporter.log("sumo()",true);
  }
  @Test
  public void sumo01()
  {
	  Reporter.log("sumo01()",true);
  }
  @Test
  public void sumo02()
  {
	  Reporter.log("sumo02()",true);
  }
}

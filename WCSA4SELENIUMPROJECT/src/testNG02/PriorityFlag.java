package testNG02;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {
  @Test(priority = 3)
  public void z1()
  {
	  Reporter.log("z1()",true);
  }
  @Test(priority = 1)
  public void h1()
  {
	  Reporter.log("h1()",true);
  }
  @Test(priority = 0)
  public void k1()
  {
	  Reporter.log("r1()",true);
  }
  @Test(priority = 7)
  public void m1()
  {
	  Reporter.log("m1()",true);
  }
  @Test
  public void b1()
  {
	  Reporter.log("b1()",true);
  }
  @Test
  public void a1()
  {
	  Reporter.log("a1()",true);
  }
  @Test
  public void g1()
  {
	  Reporter.log("g1()",true);
  }
  @Test(priority = 2)
  public void p1()
  {
	  Reporter.log("p1()",true);
  }
  @Test
  public void i1()
  {
	  Reporter.log("i1()",true);
  }
  
}

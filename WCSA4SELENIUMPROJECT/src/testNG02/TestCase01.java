package testNG02;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase01 {
	@Test
	public void todayMethod() 
	{
		Assert.fail();
		//junit.framework.Assert.fail();
	}

	@Test
	public void tommorowMethod()
	{
		long ThreadId = Thread.currentThread().getId();

		Reporter.log("tommorowMethods ID is " + ThreadId, true);
	}
}

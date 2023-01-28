package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example01 {
	@Test
	public void demo() {
		// System.out.println("nknksnds");
		Reporter.log("demo()", true);
	}

	@Test
	public void demo01() {

		int a = 1;
		int b = 1;
		System.out.println(a/b);
		Reporter.log("demo01()", true);
	}
}

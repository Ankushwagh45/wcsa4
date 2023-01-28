package testNG02;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupFlag {
	@Test(groups = "FUNCTIONAL")
	public void ft1() {
		Reporter.log("Functional Testing 1", true);
	}

	@Test(groups = "INTEGRATION")
	public void it1() {
		Reporter.log("Integration Testing 1", true);
	}

	@Test(groups = "SYSTEM")
	public void st1() {
		Reporter.log("System Testing 1", true);
	}

	@Test(groups = "FUNCTIONAL")
	public void ft2() {
		Reporter.log("Functional Testing 2", true);
	}

	@Test(groups = "INTEGRATION")
	public void it2() {
		Reporter.log("Integration Testing 2", true);
	}

	@Test(groups = "SYSTEM")
	public void st2() {
		Reporter.log("System Testing 2", true);
	}

	@Test(groups = "FUNCTIONAL")
	public void ft3() {
		Reporter.log("Functional Testing 3", true);
	}

	@Test(groups = "INTEGRATION")
	public void it3() {
		Reporter.log("Integration Testing 3", true);
	}

	@Test(groups = "SYSTEM")
	public void st3() {
		Reporter.log("System Testing 3", true);
	}

	@Test(groups = "FUNCTIONAL")
	public void ft4() {
		Reporter.log("Functional Testing 4", true);
		System.out.println(" ");
	}

	@Test(groups = "INTEGRATION")
	public void it4() {
		Reporter.log("Integration Testing 4", true);
		System.out.println(" ");
	}

	@Test(groups = "SYSTEM")
	public void st4() {
		Reporter.log("System Testing 4", true);
		System.out.println(" ");
	}
}

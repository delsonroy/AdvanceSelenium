package day01;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {

	@BeforeMethod
	public void login() {
		Reporter.log("login", true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("logout", true);
	}

	// Diff bw Invocataion Count and For Loop

	@Test
	public void testA()// Considere as One test and Only one report will be generated
	{
		for (int i = 0; i < 3; i++) {
			Reporter.log("forloop", true);
		}
	}

	@Test(invocationCount = 3)
	public void testB() {
		Reporter.log("InvlocationCount", true);

	}

	final int i = 4;

	@Test(invocationCount = i)
	public void testC() {
		Reporter.log("InvlocationCount", true);

	}

}

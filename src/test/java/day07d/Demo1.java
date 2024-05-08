package day07d;

import java.lang.reflect.Method;
import java.util.Date;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	// ITestContext, XMLTest, Method, Object[]
	@BeforeMethod
	public void m1(Method m) {

		String meth = m.getName();
		System.out.println("Hi b4 method " + meth);
	}
	// Can accept on ITestContext
	@Test
	public void testA() {
		System.out.println("Test of DemoA");
	}
	@Test
	public void testB() {
		System.out.println("Test of DemoB");
		Assert.fail();
	}
	// ITestReult, XMLTest, Method
	@AfterMethod
	public void m2(ITestResult result) {

		String testname = result.getName();
		int status = result.getStatus();
		if (status == 1) {
			System.out.println("Test is passed");
		} else if (status == 2) {
			System.out.println("Test is Failed");
		} else {
			System.out.println("Test is Skipped");
		}

		System.out.println("Bye after method" + testname);
	}
}

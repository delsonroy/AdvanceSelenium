package day12;

import java.util.List;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void testA()
	{
		Reporter.log("Hi This is test a");
		Reporter.log("Bye this is test A");
	}
	@AfterMethod
	public void m1(ITestResult result)
	{
		System.out.println("End");
	    List<String> output = Reporter.getOutput(result);
	    for (String s: output) {
	    	System.out.println(s);
		}
	}

}

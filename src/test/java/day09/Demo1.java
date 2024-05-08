package day09;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {

	@BeforeMethod
	public void m1()
	{
		Reporter.log("This is m1...", true);
		
	}
	
	
	@Test
	public void testA()
	{
		Reporter.log("This is testA...", true);
		
	}
	@AfterMethod
	public void m2()
	{
		Reporter.log("This is m2...", true);
	}
}

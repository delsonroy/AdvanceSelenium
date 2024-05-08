package day07c;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class DemoC {
	
	@Test
	public void testC()
	{
		Reporter.log("testC", true);
		Assert.fail();
		
	}


}

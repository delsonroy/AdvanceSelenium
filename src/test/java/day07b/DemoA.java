package day07b;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class DemoA {
	
	@Test
	public void testA()
	{
		Reporter.log("testA", true);
		
	}

}

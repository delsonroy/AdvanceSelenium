package day01;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	//-3 -1 -2 0 1 2 3 ARE ALLOWED
	//no variable 
	// we can use constant final variable
	//if two method has same priority then it runs in alphabetical order
	
	@Test(priority = 1)
	public void testA() {
		Reporter.log("testA", true);
	}

	@Test(priority = 0)
	public void testB() {
		Reporter.log("testB", true);
	}
	
	
}

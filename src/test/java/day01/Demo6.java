package day01;

import org.testng.Reporter;
import org.testng.annotations.Test;


// We can provide @Test at class level, it will run in alphabetical order but we wont be able to provide, individual priority, 
//Depends on , invocationcount etc

@Test
public class Demo6 {
	
	public void testA()
	{
		Reporter.log("A", true);
	}
	public void testB()
	{
		Reporter.log("B", true);
	}
	public void testc()
	{
		Reporter.log("C", true);
	}
	

}

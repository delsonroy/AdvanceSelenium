package day11;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	@Test(priority = 1, retryAnalyzer= Retry.class)
	public void testA()
	{
		Reporter.log("testA...", true);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Input:");
		String av=sc.next();
		Assert.assertEquals(av, "abcd");
		sc.close();				
	}
	
	@Test(priority = 2, retryAnalyzer= Retry.class)
	public void testB()
	{
		Reporter.log("testB...", true);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Input:");
		String av=sc.next();
		Assert.assertEquals(av, "abcd");
		sc.close();				
	}

}

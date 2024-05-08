package day11;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	public static int count = 0;

	@Override
	public boolean retry(ITestResult result)
	{

		System.out.println("We are inside retry methd ");
		System.out.println("The failed method is  " + result.getName());

		if (count < 1) // How many times to run
		{
			count++;
			return true; // true-> Re-run
		} 
		else 
		{
			System.out.println("Already re-executed; Hence failing");
			return false; // false -> don't re run
		}
		
		

	}
}

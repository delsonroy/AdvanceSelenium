package day07c;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Excel;
import utility.Excel2;

public class TestListener implements ITestListener {
	
	
	public void onTestStart(ITestResult result) {

	}
//On TestSuccess is called by TestNG while when we pass the TestNG and the testng has pass the result type called 
	//ItestResult and this is done by automatically and it is called as Dependecny Ijection
	
	public void onTestSuccess(ITestResult result) {

		String methodname=result.getName();
		System.out.println(methodname+" method is passed");
		int rc = Excel.getRowCount("./data/Report.xls","Sheet1");
		Excel2.writeDataToCell("./data/Report.xls", "Sheet1", rc+1, 0, methodname);
		Excel2.writeDataToCell("./data/Report.xls", "Sheet1", rc+1, 1, "Passed", false);
	}

	public void onTestFailure(ITestResult result) {
		
		String methodname=result.getName();
		System.out.println(methodname+" method is failed");
		int rc = Excel2.getRowCount("./data/Report.xls","Sheet1");
		Excel2.writeDataToCell("./data/Report.xls", "Sheet1", rc+1, 0, methodname);
		Excel2.writeDataToCell("./data/Report.xls", "Sheet1", rc+1, 1, "Failed", true);
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		// This is the starting of the testNG
	}

	public void onFinish(ITestContext context) {

	}

}

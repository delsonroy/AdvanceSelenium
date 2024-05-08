package day07b;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.println("Started Executing the test method");

	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Test method is passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		// This is the starting of the testNG
		System.out.println("When the testNG is started");
	}

	public void onFinish(ITestContext context) {

		System.out.println("TestNG execution is finished");
	}

}

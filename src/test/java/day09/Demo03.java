package day09;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String img="../image/desktop.png";
		ExtentReports report = new ExtentReports();
		
		ExtentSparkReporter spark= new ExtentSparkReporter("target/Spark.html");
		report.attachReporter(spark);
		
		ExtentTest test1 = report.createTest("ValidLoginDelson");
		//test1.fail("This is fail");
		test1.skip("This is skip");
		test1.pass("This is pass");
		test1.warning("This is warning");
		test1.info("This is info");
		
		ExtentTest test2 = report.createTest("InvaLid Login");
		test2.fail("This is fail");
	
		test2.addScreenCaptureFromPath(img, "This is img");
		
		
		report.flush();
		
		

	}

}

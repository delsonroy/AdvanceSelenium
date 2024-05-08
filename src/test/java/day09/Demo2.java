package day09;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo2 {

	public static void main(String[] args) {
		
		ExtentReports report= new ExtentReports();
		//Create format Object -Spark and attach it
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		//first I need to use AttachReporter
		report.attachReporter(spark);
		//Generattes the report
		
		ExtentTest test1 = report.createTest("ValidLoginDelson");
		//test1.fail("This is fail");
		test1.skip("This is skip");
		test1.pass("This is pass");
		test1.warning("This is warning");
		test1.info("This is info");
		
		ExtentTest test2 = report.createTest("InvaLid Login");
		test2.fail("This is fail");
		test2.skip("This is skip");
		test2.pass("This is pass");
		test2.warning("This is warning");
		test2.info("This is info");
		
		
		
		report.flush();
		
	}

}

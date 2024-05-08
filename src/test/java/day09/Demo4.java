package day09;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo4 {

	public static void main(String[] args) {

		
		String img="../image/element.png";
		
		ExtentReports report = new ExtentReports();
		
		//Create format Object
		
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		report.attachReporter(spark);
		
		ExtentTest test1 = report.createTest("InvaLid Login");
		
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
				test2.info("This is info1");
				test2.info("This is info2");
				test2.info("This is info3");
				test2.info("This is info4");
				test2.fail("This is fail", MediaEntityBuilder.createScreenCaptureFromPath(img).build());
				test2.info("This is info5");
				test2.info("This is info6");
				test2.info("This is info7");
				test2.info("This is info8");
				test2.info("This is info9");
				test2.info("This is info10");
				
				
			
				test2.addScreenCaptureFromPath(img, "This is img");
				
				
				report.flush();
		
	}

}

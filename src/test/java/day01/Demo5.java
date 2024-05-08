package day01;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo5 {

	//If we directl run this from testNG we get"TestNG exception" Otherwise we need to add @optional
	//If there is no optional, we need to run it from the testng.xml file
	@Parameters({"city"})
	@Test
	public void testA(@Optional("pune ") String city)
	{
		Reporter.log(city, true);
		
	}
}

package day03;

import org.testng.TestNG;

public class Demo10 {

	public static void main(String[] args) {

		
		
		TestNG testng = new TestNG();
		Class[] allClasses = {DemoD.class, DemoE.class, DemoF.class};
		testng.setTestClasses(allClasses);
		testng.run();
		
	}

}

package day03;

import org.testng.TestNG;

public class DemoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Running testng classes from main method
		
		TestNG testng= new TestNG();
		Class[] allClasses= {Demo6.class, Demo7.class, Demo8.class};
		testng.setTestClasses(allClasses);
		testng.run();
		
		
	}

}

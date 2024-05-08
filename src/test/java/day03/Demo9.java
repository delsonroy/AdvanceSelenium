package day03;

import org.testng.TestNG;

public class Demo9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//Running testng classes from main method
		
		TestNG testng= new TestNG();
		String cn= "day03.Demo6";
	    Class c1 = Class.forName(cn);
		Class c2=Class.forName("day03.Demo7");
		Class c3=Class.forName("day03.Demo8");
	    
		Class[] allClasses= {c1,c2,c3};
		testng.setTestClasses(allClasses);
		testng.run();
		
		
	}

}
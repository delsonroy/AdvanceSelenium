package day03;

import org.testng.TestNG;

public class Demo11 {

	public static void main(String[] args) throws Exception {

		
		TestNG testng= new TestNG();
		
		Class c1=Class.forName("day03.DemoD");
		Class c2=Class.forName("day03.DemoE");
		Class c3=Class.forName("day03.DemoF");
		Class[] allclasses = {c1,c2,c3};
		testng.setTestClasses(allclasses);
		
		testng.run();
		
	}

}

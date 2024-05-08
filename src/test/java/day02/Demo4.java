package day02;

import org.testng.TestNG;

public class Demo4 {

	public static void main(String[] args) {
		
            Class[] allTests = {Demo1.class, Demo2.class, Demo3.class};
            
            TestNG testng = new TestNG();
            testng.setTestClasses(allTests);
            testng.run();
            
	}

}

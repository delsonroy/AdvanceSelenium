package day02;

import org.testng.annotations.Factory;

public class MySuite {

	@Factory
	public Object[] createsuite() {

		Object[] allTests = { new Demo1(), new Demo2(), new Demo3() };
		return allTests;

	}

}

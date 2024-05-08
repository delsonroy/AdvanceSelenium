package day03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class F {

	public static void m1() {
		System.out.println("m1 of F class");
	}

	public static void m2() {
		System.out.println("m2 of F class");
	}

}

class G {
	public static void m1() {
		System.out.println("m1 of G class");
	}

	public static void m2() {
		System.out.println("m2 of G class");
	}

}

public class Demo5 {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the FQclass name ");
		String className = s.next();
		System.out.println("Enter the methodname ");
		String methodName = s.next();

		// Suppose class name is in a String
		// String className="day03.F";
		// String methodName="m1";

		// Convert String into Javacode
		Class cls = Class.forName(className);
		Method m = cls.getDeclaredMethod(methodName, null);
		m.invoke(null);

	}

}

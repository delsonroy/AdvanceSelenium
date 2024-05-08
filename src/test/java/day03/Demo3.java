package day03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class D {

	public static void m1() {

		System.out.println("m1 of c");

	}

	public int m2(int i) {
		System.out.println("m2 of c" + i);
		return i;
	}
}

public class Demo3 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Method[] method = D.class.getDeclaredMethods();
		for (Method method2 : method) {

			System.out.println(method2.getName());
			System.out.println(method2.getReturnType());
			System.out.println(Modifier.toString(method2.getModifiers()));
			System.out.println(method2.getReturnType());
			int pcount = method2.getParameterCount();
			if (pcount == 1) {
				Object res = method2.invoke(new D(), 10);
				System.out.println(res);

			} else {
				method2.invoke(new D(), null);
			}

		}

	}

}

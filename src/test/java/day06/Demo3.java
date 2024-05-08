package day06;

class A {

	private static A a1 = null;

	private A() {

	}

	public static A setConstructor() {
		if (a1 == null) {
			a1 = new A();
			return a1;

		} else {

			return a1;
		}

	}

}

public class Demo3 {

	public static void main(String[] args) {

		A v = A.setConstructor();
		System.out.println(v);
		A v2 = A.setConstructor();
		System.out.println(v2);
		

	}

}

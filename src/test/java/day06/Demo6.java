package day06;

class B {

	void m1() {
		System.out.println("m1 of B");
	}
}

class c extends B {
	void m1() {
		System.out.println("hi");
		super.m1(); // callin the existing thing
		System.out.println("bye");
	}

}

public class Demo6 {

	public static void script(B b1) {
		b1.m1();
	}

	public static void main(String[] args) {

		B b1 = new c();
		Demo6.script(b1);
	}

}

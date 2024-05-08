package day03;

class E {

}

public class Demo4 {

	public static void main(String[] args) throws ClassNotFoundException {

		Class v = day03.E.class;
		System.out.println(v);

		String classname = "day03.E"; // Anything inside a double quotes is not a java program and it is a string this
										// can be converted to
										// class type by using the method present in the Class called forname

		Class v2 = Class.forName(classname);
		System.out.println(v2);

	}

}

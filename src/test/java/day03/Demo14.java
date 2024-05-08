package day03;

public class Demo14 {

	public static void main(String[] args) throws Exception {
		// Get the class object for Demo13
		Class clazz = Demo13.class;

		// Get the package name of the class
		Package pkg = clazz.getPackage();
		String packageName = pkg.getName();

		System.out.println(packageName);
	}

}

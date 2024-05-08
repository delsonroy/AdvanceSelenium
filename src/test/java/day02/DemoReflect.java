package day02;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class DemoReflect {

	int a = 5;
	public static final String d = "Delson";
	protected boolean b = true;

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

		DemoReflect a = new DemoReflect();
		Field[] varibles = DemoReflect.class.getDeclaredFields();
		for (Field field : varibles) {

			System.out.println(field.getName());
			System.out.println(field.getType());
			System.out.println(field.get(a));
			int mod = field.getModifiers();
			System.out.println(Modifier.toString(mod));
			System.out.println("--------------------------");
			
			System.out.println(field);

		}

	}

}

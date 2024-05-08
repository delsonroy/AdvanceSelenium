package day03;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Demo2b {
	
	public static final int a=10;
	
	protected String s="Dell The Architect";
	

	public static void main(String[] args) throws Exception {
		
		Demo2b obj= new Demo2b();
		
		Field[] f = Demo2b.class.getDeclaredFields();
		for (Field var : f) {
			
			System.out.println(var.getName());// name of the variable
			System.out.println(var.getType());//datatype of the fields
			System.out.println(var.get(obj));//value inside the variable
			System.out.println(Modifier.toString(var.getModifiers()));//type of modifier
			System.out.println("------------------");
			
		}
	}

}

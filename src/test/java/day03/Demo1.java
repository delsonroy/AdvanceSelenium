package day03;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Demo1 {

	public static int a =10;
	protected String s="Delson";
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
               //Demo1 s1= new Demo1();
               
		
 
		Field var = Demo1.class.getDeclaredField("a");
		System.out.println(var.getName());
		System.out.println(var.getType());
	    System.out.println(var.getInt(a));
	    int mod = var.getModifiers();
	    System.out.println(Modifier.toString(mod));
		
	    Field var2 = Demo1.class.getDeclaredField("s");
	    System.out.println(var2.getName());
		System.out.println(var2.getType());
	    System.out.println(var2.get(new Demo1()));
	    int mod2 = var2.getModifiers();
	    System.out.println(Modifier.toString(mod2));
	    
	}

}

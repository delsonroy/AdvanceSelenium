package day03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class c {

	public static void m1() {

		System.out.println("m1 of c");

	}
	
	public int m2(int i)
	{
		System.out.println("m2 of c"+i);
		return i ;
	}
}

public class Demo2 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                         
		                Method meth = c.class.getDeclaredMethod("m1");
		                System.out.println(meth.getName());
		                System.out.println(Modifier.toString(meth.getModifiers()));
		                System.out.println(meth.getReturnType());
		                meth.invoke(null);
		                
		                Method meth2 = c.class.getMethod("m2", int.class);
		                System.out.println(meth2.getName());
		                System.out.println(Modifier.toString(meth2.getModifiers()));
		                System.out.println(meth2.getReturnType());
		                meth2.invoke(new c(), 10);
		
	}

}

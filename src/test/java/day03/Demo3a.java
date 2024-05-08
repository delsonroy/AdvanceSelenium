package day03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo3a {
	
	public static void a(int a, int b)
	{
		
		System.out.println(a+b);
	}
	public final void b(int c, int d)
	{
		
		System.out.println(c+d);
	}
	

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Demo3a obj= new Demo3a();
		Method[] m = Demo3a.class.getDeclaredMethods();
		
		for (Method method : m) {
			
			System.out.println(method.getName());
		    System.out.println(Modifier.toString(method.getModifiers()));
		    System.out.println(method.getDefaultValue());
		    System.out.println(method.getParameterCount());
		    System.out.println(method.getReturnType());
		     int count= method.getParameterCount();
		    if(count>=2)
		    {
		    
		    	System.out.println(method.invoke(obj,10,20));
		    }
		    else
		    {
		    	System.out.println("skip the other methid");
		    	
		    }
		    System.out.println("-----------------------------");
			
			
		}		
	}
}

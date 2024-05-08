package day03;

import java.lang.reflect.Method;
import java.util.Scanner;

class H
{
	
  public static void m1()
  {
	  System.out.println("Hi");
  }
  public static void m2()
  {
	  System.out.println("Hi from m2");
  }

}

public class Demo4a {

	public static void main(String[] args) throws Exception {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the class name you want print ");
		String classname = s.next();
		
		
		System.out.println("Enter the method name you want print ");
		Scanner s1= new Scanner(System.in);
		String methodname =s1.next();
		
		Class c1=Class.forName(classname);
		Method method = c1.getDeclaredMethod(methodname);
		System.out.println(method.getName());
		method.invoke(methodname);
		
		
		
	}

}

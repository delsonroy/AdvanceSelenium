package day16;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

class Webutil {

	public static void enter(WebDriver driver, String keyword2, String keyword3) {
		System.out.println("This is from the enter method ");

	}

	public static void click(WebDriver driver, String keyword2) {
		System.out.println("This is from the click method ");
	}

	public static void submit() {

	}

}

public class Demo {
	public static void main(String[] args) throws Exception {

		WebDriver driver = null;
		String keyword1 = "click";
		String keyword2 = "xpath";
		String keyword3 = "value";
		Method[] allmethods = Webutil.class.getDeclaredMethods();
		for (Method method : allmethods)
		{
			String actualname = method.getName();
			int count = method.getParameterCount();
			System.out.println("Method is " + actualname + " and paramter count is " + count);
					if (actualname.equalsIgnoreCase(keyword1))
						{
							if (count == 2) 
							{
								method.invoke(null, driver, keyword2);
							}
							else 
							{
								method.invoke(null, driver, keyword2, keyword3);
							}
						}

		}

	}

}

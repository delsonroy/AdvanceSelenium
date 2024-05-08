package day10;

import java.lang.reflect.Field;

import org.openqa.selenium.By;

import net.bytebuddy.utility.privilege.SetAccessibleAction;

public class Demo1 {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

		By b = By.xpath("username");
        String FQCN=b.getClass().getCanonicalName();
		System.out.println(FQCN.split("By")[2]);
		
		//The above lines provide me the locator	
		
		Field[] allF = b.getClass().getDeclaredFields();
		allF[0].setAccessible(true);
		System.out.println(allF[0].get(b));
		
		}
	}

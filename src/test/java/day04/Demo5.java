package day04;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo5 {

	@DataProvider
	public Iterator<String[]> getData()
	{
		ArrayList<String[]> list= new ArrayList<String[]> ();
		
		String[] a = {"a1", "b1", "c1"};
		list.add(a);
		String[] b = {"a2", "b2", "c2"};
		list.add(b);
		
		return list.iterator();
	}	
	
	@Test(dataProvider = "getData")
	
	public void testA(String...a)
	{
		for (String string : a) {
			
			System.out.println(string);
			
		}
		
	}

}

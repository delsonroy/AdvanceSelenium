package day04;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo6 {

	@DataProvider
	public Iterator<String[]> getData()
	{
		ArrayList<String[]> list= Demo4.getSheetDataToList("./data/TestData.xls", "Sheet1");
		
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

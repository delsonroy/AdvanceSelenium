package day26;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Demo7 {

	public static String[][] getDataFromJSONtoArray(String path)
	{
		String[][] data=null;
		try
		{
		JsonPath json=new JsonPath(new FileInputStream(path));
		LinkedHashMap<String,ArrayList<String>> map=json.get();
		
		int rowCount=map.size();	
		data=new String[rowCount][];
		
		Set<String> allKeys = map.keySet();
		
		int i=0;
		
		for(String key:allKeys) 
		{
			ArrayList<String> value =map.get(key);
			int columnCount=value.size();
			data[i]=new String[columnCount];
			
			for(int j=0;j<columnCount;j++)
			{
				String v = value.get(j);
				data[i][j]=v;
			}
			
			i++;
		}
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return data;
	}
	
	@DataProvider
	public String[][] getData()
	{
		return getDataFromJSONtoArray("./data2/info.json");
	}
	
	@Test(dataProvider = "getData")
	public void testA(String... data)
	{
		for(String v:data)
		{
			Reporter.log(v,true);
		}
		
		Reporter.log("--------",true);
	}
	

}

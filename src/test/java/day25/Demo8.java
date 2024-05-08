package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Demo8 {

	// home work -- getDataFromJSONtoArray --> String[][]
	
	public static Iterator<String[]>  getDataFromJSONtoDP(String path)
	{
		ArrayList<String[]> data=new ArrayList<String[]>();
		
		try
		{
			
		JsonPath json=new JsonPath(new FileInputStream(path));
		Map<String,List<String>> map=json.get();
		Set<String> allKeys = map.keySet();
		
		
		for(String key:allKeys)
		{
			List<String> list = map.get(key);
			int size=list.size();
			String[] s=new String[size];
			for(int i=0;i<size;i++)
			{
				String v=list.get(i);
				s[i]=v;
			}
			data.add(s);
		}
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		Iterator<String[]> iData = data.iterator();
		return iData;
	}
	
	@DataProvider
	public Iterator<String[]> getData()
	{
		return getDataFromJSONtoDP("./data2/info.json");
	}
	
	@Test(dataProvider = "getData")
	public void testA(String un,String pw)
	{
		Reporter.log(un+"-"+pw,true);
	}
}


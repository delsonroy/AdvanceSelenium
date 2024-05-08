package day26;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

import io.restassured.path.json.JsonPath;

public class Demo5 {

	public static void main(String[] args) throws Exception {
		JsonPath json= new JsonPath(new File("./data2/info.json"));
		LinkedHashMap<String, Object> map = json.get();
		
		int rowCount=map.size();
		String[][] data= new String[rowCount][];
		
		Set<String> allKeys = map.keySet();
		
		int i=0;
		
		for(String key:allKeys )
		{
			ArrayList<String> value=(ArrayList<String>) map.get(key);
			int columnCount = value.size();
			data[i]=new String[columnCount];
			
			for(int j=0; j<columnCount;j++)
			{
				String v = value.get(j);
				data[i][j]=v;
			}
			i++;
			
		}
		
		for(i=0; i<data.length; i++)
		{
			for(int j=0; j<data[i].length; j++)
			{
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}		
	}

}

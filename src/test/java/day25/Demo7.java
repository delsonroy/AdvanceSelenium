package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.restassured.path.json.JsonPath;

public class Demo7 {

	public static void main(String[] args) throws FileNotFoundException {
	
		JsonPath json=new JsonPath(new FileInputStream("./data2/info.json"));
		Map<String,List<String>> map=json.get();
		Set<String> allKeys = map.keySet();
		for(String key:allKeys)
		{
			List<String> list = map.get(key);
			int size=list.size();
			for(int i=0;i<size;i++)
			{
				System.out.println(list.get(i));
			}
		}
		
		
		
	
	}
	

}

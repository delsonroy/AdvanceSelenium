package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.restassured.path.json.JsonPath;

public class Demo5 {

	public static void main(String[] args) throws FileNotFoundException {
		
		JsonPath json=new JsonPath(new FileInputStream("./data/mycity.json"));
		
		List<Map<String,String>> travel = json.getList("travel");
		int size=travel.size();
		
		for(int i=0; i<size; i++)
		{
			Map<String, String> map = travel.get(i);
			Set<String> allKeys = map.keySet();
			
			for(String key:allKeys)
			{
				String value = map.get(key);
				System.out.println(key+"-"+value);
			}
			
		
		}
	}

}

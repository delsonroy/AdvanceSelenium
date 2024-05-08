package day26;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

import io.restassured.path.json.JsonPath;

public class Demo4 {

	public static void main(String[] args) throws Exception {
//		JsonPath json=new JsonPath(new FileInputStream("./data2/info.json"));
//		LinkedHashMap<String,Object> map=json.get();//complete JSON object
//		ArrayList<String> value =(ArrayList<String>) map.get("validlogin3");
//		String un = value.get(0);
//		System.out.println(un);
		JsonPath json= new JsonPath(new File("./data2/info.json"));
		LinkedHashMap<String, Object> map = json.get();
		
		
		Set<String> keys = map.keySet();
		for (String allKeys : keys) 
		{		
			System.out.print(allKeys+"- : ");
			ArrayList<String> value = (ArrayList<String>) map.get(allKeys);
			for (int i=0;i<value.size();i++)
			{
			   System.out.print(value.get(i)+" ");
			}
			System.out.println();
				
		}
		
	}

}

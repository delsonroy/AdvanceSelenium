package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import io.restassured.path.json.JsonPath;

public class Demo4 {

	public static void main(String[] args) throws FileNotFoundException {
		
		JsonPath json=new JsonPath(new FileInputStream("./data/mycity.json"));
		
		List<Map<String,String>> travel = json.getList("travel");
		Map<String, String> a = travel.get(0);
		String value = a.get("road");
		System.out.println(value);
		
		Map<String, String> b = travel.get(1);
		String v=b.get("train");
		System.out.println(v);
	}

}

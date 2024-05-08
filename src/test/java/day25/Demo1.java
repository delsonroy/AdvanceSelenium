package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import io.restassured.path.json.JsonPath;

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException {
	
		JsonPath json=new JsonPath(new FileInputStream("./data2/mycity.json"));
		Object val = json.get("city");
		System.out.println(val);
	
		
	}

}

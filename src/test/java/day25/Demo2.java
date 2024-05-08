package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import io.restassured.path.json.JsonPath;

public class Demo2 {

	public static void main(String[] args) throws FileNotFoundException {
	
		JsonPath json=new JsonPath(new FileInputStream("./data/mycity.json"));

		System.out.println(json.getString("city"));//String
		System.out.println(json.getString("pin"));//Integer
		System.out.println(json.getString("ticket"));//Float
		System.out.println(json.getString("hasZoo"));//Boolean
		
		System.out.println(json.getString("area"));//ArrayList
		System.out.println(json.getString("hotel"));//JSON Object- LinkedHashMap
		System.out.println(json.getString("travel"));//ArrayList
	}

}

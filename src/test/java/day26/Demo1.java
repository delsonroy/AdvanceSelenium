package day26;

import java.io.FileInputStream;
import io.restassured.path.json.JsonPath;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		JsonPath json=new JsonPath(new FileInputStream("./data2/mycity.json"));

		System.out.print(json.getString("city"));
		System.out.println( json.get("city").getClass().getSimpleName());
		
		System.out.print(json.getString("pin"));
		System.out.println( json.get("pin").getClass().getSimpleName());
		
		System.out.print(json.getString("ticket"));
		System.out.println( json.get("ticket").getClass().getSimpleName());
		
		System.out.print(json.getString("hasZoo"));
		System.out.println( json.get("hasZoo").getClass().getSimpleName());
		
		System.out.print(json.getString("area"));
		System.out.println( json.get("area").getClass().getSimpleName());
		
		System.out.print(json.getString("hotel"));
		System.out.println( json.get("hotel").getClass().getSimpleName());
		
	}

}


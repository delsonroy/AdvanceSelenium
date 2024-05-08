package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import io.restassured.path.json.JsonPath;

public class Demo3 {

	public static void main(String[] args) throws FileNotFoundException {
	
		JsonPath json=new JsonPath(new FileInputStream("./data/mycity.json"));

		String city=json.getString("city");//String
		System.out.println(city);
		
		int pin = json.getInt("pin");//Integer
		System.out.println(pin);
		
		float ticket = json.getFloat("ticket");//Float
		System.out.println(ticket);
		
		boolean zoo = json.getBoolean("hasZoo");//Boolean
		System.out.println(zoo);
		System.out.println("-----");
		List<String> area = json.getList("area");//ArrayList
		for(String a:area)
		{
			System.out.println(a);
		}
		System.out.println("-----");
		Map<String, String> hotel = json.getMap("hotel");//JSON Object- LinkedHashMap

		for(String key:hotel.keySet())
		{
			System.out.println(key+"-"+hotel.get(key));
		}
		System.out.println("-----");

	}

}

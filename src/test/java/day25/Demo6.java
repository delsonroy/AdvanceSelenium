package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import io.restassured.path.json.JsonPath;

public class Demo6 {

	public static void main(String[] args) throws FileNotFoundException {
	
		JsonPath json=new JsonPath(new FileInputStream("./data/mycity.json"));
	
		System.out.println(json.getString("city"));
		
		System.out.println(json.getString("pin"));
		
		System.out.println(json.getString("ticket"));
		
		System.out.println(json.getString("hasZoo"));
		
		System.out.println("----");
		System.out.println(json.getString("area"));
		System.out.println(json.getString("area.size()"));
		
		System.out.println(json.getString("area[0]"));
		
		System.out.println(json.getString("area[1]"));
		System.out.println("----");
		
		System.out.println(json.getString("hotel"));
		
		System.out.println(json.getString("hotel.name"));
		System.out.println(json.getString("hotel.food"));
		System.out.println("----");
		System.out.println(json.getString("travel"));
		System.out.println(json.getString("travel.size()"));
		
		System.out.println(json.getString("travel[0]"));
		System.out.println(json.getString("travel[0].road"));
		
		System.out.println(json.getString("travel[1]"));
		System.out.println(json.getString("travel[1].train"));
		
		System.out.println(json.getString("travel[2]"));
		System.out.println(json.getString("travel[2].flight"));
		
		
		
	
	}
	

}

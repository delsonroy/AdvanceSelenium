package day26;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import io.restassured.path.json.JsonPath;

public class Demo2 {

	public static void main(String[] args) throws Exception {
//		JsonPath json=new JsonPath(new FileInputStream("./data2/info.json"));
//		LinkedHashMap<String,Object> map=json.get();//complete JSON object
//		ArrayList<String> value =(ArrayList<String>) map.get("validlogin3");
//		String un = value.get(0);
//		System.out.println(un);
		JsonPath json= new JsonPath(new File("./data2/info.json"));
		LinkedHashMap<String, Object> map = json.get();
		ArrayList<String> value = (ArrayList<String>) map.get("validlogin1");
		System.out.println(value.get(0));
		System.out.println(value.get(1));
	
	}

}

package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {
	
	
	
	public static String getProperty(String path, String key)
	{
		
		String value=""; 
		try {
		Properties p = new Properties();
		p.load(new FileInputStream(path));
		value=p.getProperty(key);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return value;
	}

	public static void main(String[] args) throws Exception, IOException {

		Properties p = new Properties();
		p.load(new FileInputStream("./config.properties"));
		String city=p.getProperty("city");
		System.out.println(city);
		System.out.println(p.getProperty("pin"));
		
	}

}

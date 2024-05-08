package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo3 {

	public static void main(String[] args) throws Exception, IOException {

		Properties p = new Properties();
		p.load(new FileInputStream("./config.properties"));
		p.remove("area");
		p.store(new FileOutputStream("./config.properties"), "Removed by Delson");
	}

}

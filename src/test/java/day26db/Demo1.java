package day26db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		//String url="jdbc:mysql://localhost:3306/erp"; //->Connection String
		String un="root";
		String pw="";
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp", un, pw);
        connection.close();
        System.out.println("Done");
		
	}

}

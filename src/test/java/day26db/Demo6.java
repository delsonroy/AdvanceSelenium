package day26db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo6 {
//connect to DB,delete record & disconnect
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp","root","");
		
		String query="delete from emp where id='A5'";
		
		connection.createStatement().executeUpdate(query);
		
		connection.close();
		
		System.out.println("---Done---");
	}

}

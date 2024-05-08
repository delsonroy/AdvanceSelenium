package day26db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Demo7 {
//connect to DB,update data & disconnect
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp","root","");
		
		String query="update emp set name='Amelia' where id='a3'";
		
		connection.createStatement().executeUpdate(query);
		
		connection.close();
		
		System.out.println("---Done---");
	}

}

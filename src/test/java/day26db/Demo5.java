package day26db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Demo5 {
//connect to DB,insert data & disconnect
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp","root","");
		
		String query="insert into emp values('a4','Lian','Kochi')";
		
		connection.createStatement().executeUpdate(query);//We have to use executeupdate for updating the emp table
		
		connection.close();
		
		System.out.println("---Done---");
	}

}

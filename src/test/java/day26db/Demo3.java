package day26db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Demo3 {
//connect to DB,execute query , print headers & disconnect
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp","root","");
		
		String query="select * from emp";
		ResultSet resultSet = connection.createStatement().executeQuery(query);
		
		System.out.println(resultSet.next());//goto 1st record-->true 1st record is present
		
		String id=resultSet.getString(1);
		System.out.println(id);
		
		String name=resultSet.getString(2);
		System.out.println(name);
		
		String city=resultSet.getString(3);
		System.out.println(city);
		
		System.out.println("-----------------");
		System.out.println(resultSet.next());//goto 2nd record is present
		
		id=resultSet.getString("id");
		System.out.println(id);
		
		 name=resultSet.getString("name");
		System.out.println(name);
		
		 city=resultSet.getString("city");
		System.out.println(city);
		
		System.out.println(resultSet.next());//false- 3rd record is not present-false
		connection.close();
		
		System.out.println("---Done---");
	}

}

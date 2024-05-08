package day26db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Demo2 {
//connect to DB,execute query , print headers & disconnect
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp","root","");
		
		String query="select * from emp";
		ResultSet resultSet = connection.createStatement().executeQuery(query);
		
		ResultSetMetaData headers = resultSet.getMetaData(); //column headers
		int colCount = headers.getColumnCount();
		System.out.println("Number of columns:"+colCount);
		
		for(int i=1;i<=colCount;i++)
		{
			String cn=headers.getColumnName(i);
			System.out.println(cn);
		}
		connection.close();
		
		System.out.println("---Done---");
	}

}

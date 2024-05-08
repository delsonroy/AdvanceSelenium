package day26db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/erp","root","");
		ResultSet result = connection.createStatement().executeQuery("select *from emp");
		int count=result.getMetaData().getColumnCount();
		while(result.next())
		{
			for(int i=1; i<=count; i++)
			{
				String v=result.getString(i);
				System.out.println(v);
			}
			System.out.println("-------------");
			
		}	
		connection.close();
		System.out.println("--Done--");
		
	}

}

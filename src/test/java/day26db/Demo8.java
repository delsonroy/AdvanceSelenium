package day26db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class Demo8 {
//get Data from DB to DP-Object[],Object[][],Iterator<Object>,Iterator<Object[]>
	public static void main(String[] args) throws SQLException {
		
		ArrayList<String[]> data=new ArrayList<String[]>();
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp","root","");
		
		String query="select * from emp";
		ResultSet resultSet = connection.createStatement().executeQuery(query);
		int colCount=resultSet.getMetaData().getColumnCount();
		
		while(resultSet.next())
		{
			String[] rec=new String[colCount];
			
			for(int i=1;i<=colCount;i++)
			{
				String v=resultSet.getString(i);
				rec[i-1]=v;
			}

			data.add(rec);
		}
		connection.close();
		

		for(String[] rec:data)
		{
			for(String v:rec)
			{
				System.out.println(v);
			}
			System.out.println("-------------");
		}
		
	}

}

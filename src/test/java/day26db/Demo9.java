package day26db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo9 {

	public static Iterator<String[]> getDataFromDBtoIterator(String dbURL,String un,String pw,String query)
	{
		ArrayList<String[]> data=new ArrayList<String[]>();
		try {
				Connection connection = DriverManager.getConnection(dbURL,un,pw);
				
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
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return data.iterator();
	}
	public static void main(String[] args) 
	{
		
	
		Iterator<String[]> data = getDataFromDBtoIterator("jdbc:mysql://localhost:3306/erp","root","","select * from emp");
		while(data.hasNext())
		{
			String[] rec = data.next();
			for(String v:rec)
			{
				System.out.println(v);
			}
			System.out.println("---");
		}
		
	}

}

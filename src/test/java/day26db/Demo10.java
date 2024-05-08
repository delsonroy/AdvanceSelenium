package day26db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo10 {

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
	
	@DataProvider
	public Iterator<String[]> getData()
	{
		return getDataFromDBtoIterator("jdbc:mysql://localhost:3306/erp","root","","select * from emp");
	}
	
	@Test(dataProvider = "getData")
	public void testA(String... data)
	{
		for(String v:data)
		{
			Reporter.log(v,true);
		}
		
		Reporter.log("--------",true);
	}
	

}

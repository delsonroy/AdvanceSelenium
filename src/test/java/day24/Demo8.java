package day24;

import java.io.FileReader;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo8 {

	public static String[][] getDataFromCSVtoArray(String path)
	{
		String[][] data=null;
		
		try {
				FileReader f=new FileReader(path);
				CSVParser csvParser = CSVParser.parse(f,CSVFormat.DEFAULT);
				List<CSVRecord> allRecords = csvParser.getRecords();
				
				int rowCount=allRecords.size();
				int colCount=allRecords.get(0).size();
				
				data=new String[rowCount-1][colCount];
				
				for(int i=1;i<rowCount;i++)
				{
					CSVRecord record = allRecords.get(i);
					
					for(int j=0;j<colCount;j++)
					{
						String v = record.get(j);
						data[i-1][j]=v;
					}
		
				}
				csvParser.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return data;
	}
	
	@DataProvider
	public String[][] getData()
	{
		return getDataFromCSVtoArray("./data2/info.csv");
	}
	
	@Test(dataProvider = "getData")
	public void testA(String id,String name,String city)
	{
		Reporter.log(id+"-"+name+"-"+city,true);
	}
	
	@Test(dataProvider = "getData")
	public void testA(String... input)
	{
		for(String v:input)
		{
			Reporter.log(v,true);	
		}
		
	}
	
}

package day24;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo9 {

	public static Iterator<String[]> getDataFromCSVtoIterator(String path)
	{
		ArrayList<String[]> data=new ArrayList<String[]>();
		
		try {
				FileReader f=new FileReader(path);
				CSVParser csvParser = CSVParser.parse(f,CSVFormat.DEFAULT);
				List<CSVRecord> allRecords = csvParser.getRecords();
				
				int rowCount=allRecords.size();
				int colCount=allRecords.get(0).size();

				for(int i=1;i<rowCount;i++)
				{
					CSVRecord record = allRecords.get(i);
					String[] a=new String[colCount];
					for(int j=0;j<colCount;j++)
					{
						String v = record.get(j);
						a[j]=v;
					}
		
					data.add(a);
				}
				csvParser.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		Iterator<String[]> iData = data.iterator();
		return iData;
	}
	
	@DataProvider
	public Iterator<String[]> getData()
	{
		return getDataFromCSVtoIterator("./data2/info.csv");
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

package day24;

import java.io.FileReader;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Demo7 {

	public static void main(String[] args) throws Exception{
		FileReader f=new FileReader("./data2/info.csv");
		CSVParser csvParser = CSVParser.parse(f,CSVFormat.DEFAULT);
		List<CSVRecord> allRecords = csvParser.getRecords();
		
		int rowCount=allRecords.size();//count the rows
		int colCount=allRecords.get(0).size();//count the columns of 1st row
		
		String[][] data=new String[rowCount-1][colCount];
		
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
		
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+" - ");
			}
			System.out.println();
		}
	}

}

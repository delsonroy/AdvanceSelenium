package day24;

import java.io.FileReader;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Demo6 {

	public static void main(String[] args) throws Exception{
		FileReader f=new FileReader("./data2/info.csv");
		CSVParser csvParser = CSVParser.parse(f,CSVFormat.DEFAULT);
		List<CSVRecord> allRecords = csvParser.getRecords();
		
		int rowCount=allRecords.size();
		for(int i=1;i<rowCount;i++)//each row
		{
			CSVRecord record = allRecords.get(i);
			int colCount=record.size();
			for(int j=0;j<colCount;j++)//each col
			{
				String v = record.get(j);
				System.out.print(v+" ");
			}
			System.out.println();
		}
		csvParser.close();
	}

}

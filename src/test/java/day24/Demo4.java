package day24;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		
		FileReader reader=new FileReader("./data/info.csv");
		
		CSVParser csvp = CSVParser.parse(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());
		List<String> allHeaders = csvp.getHeaderNames();
		for(String header:allHeaders)
		{
			System.out.print(header+" - ");
		}
		System.out.println();
		List<CSVRecord> allRecords = csvp.getRecords();
		for( CSVRecord record:allRecords)
		{
			int cc = record.size();
			for(int i=0;i<cc;i++)
			{
				String v=record.get(i);
				System.out.print(v+"- ");
			}
			System.out.println();
		}
		
		csvp.close();
		
	}

}

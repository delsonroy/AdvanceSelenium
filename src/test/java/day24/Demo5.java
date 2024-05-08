package day24;

import java.io.FileReader;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Demo5 {

	public static void main(String[] args) throws Exception{
		FileReader f=new FileReader("./data2/info.csv");
		CSVParser csvParser = CSVParser.parse(f,CSVFormat.DEFAULT);
		List<CSVRecord> allRecords = csvParser.getRecords();
		int rowCount=allRecords.size();
		System.out.println(rowCount);//5
		
		CSVRecord firstRecord = allRecords.get(1);
		int colCount=firstRecord.size();
		System.out.println(colCount);//3
		
		String v = firstRecord.get(1);//2nd col of 2nd row-
		System.out.println(v);
		
		csvParser.close();
	}

}

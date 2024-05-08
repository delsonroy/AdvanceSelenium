package day24;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		
		FileReader reader= new FileReader("./data2/info.csv");
		CSVParser csvp = CSVParser.parse(reader, CSVFormat.DEFAULT);
		List<CSVRecord> allrecords = csvp.getRecords();
		int count=allrecords.size();
		System.out.println(count);

	}

}

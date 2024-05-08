package day24;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		
		FileReader reader=new FileReader("./data2/info.csv");
		
		CSVParser csvp = CSVParser.parse(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());
		for( CSVRecord rec:csvp)//for loop -> every row
		{
			String v1 = rec.get("Id");
			System.out.print(v1+"-");
			
			String v2 = rec.get("Name");
			System.out.print(v2+"-");
			
			String v3 = rec.get("Address");
			System.out.println(v3);
			
		}
		
		csvp.close();
		
	}

}

package day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {

	public static LinkedHashMap<String, String> getDatatoMap(String path, String sheet, int row)
	{
		LinkedHashMap<String, String>map=new LinkedHashMap<String, String>();
		
		try {
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		
		int cc=wb.getSheet(sheet).getRow(row).getLastCellNum();
		
		
		for(int i=0; i<cc; i++)
		{   String Key=wb.getSheet(sheet).getRow(0).getCell(i).toString();
			String value=wb.getSheet(sheet).getRow(row).getCell(i).toString();
			map.put(Key, value);
		}
		wb.close();
		}
		catch(Exception e){
			e.getMessage();
			
		}
		
		return map;
	}
	
	
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
	
	  LinkedHashMap<String, String> map = getDatatoMap("./data/TestData.xls", "Sheet2", 1);
	  System.out.println(map);
	

}
}
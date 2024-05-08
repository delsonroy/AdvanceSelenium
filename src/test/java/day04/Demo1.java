package day04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {
	public static int getColumnCount(String path, String sheet, int rn) {

		int cc=0;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			cc= wb.getSheet(sheet).getRow(rn).getLastCellNum();
;			// Because the Lastrownnum provide the index of Rows and it starts from 0
			wb.close();
			
			
		} catch (Exception e) {

			//e.printStackTrace();// Always print the error
			
			//always print the message
			
			System.err.println(e.getMessage());//This prints the message in red color
		}
		return cc;

	}
	
	public static int getRowCount(String path, String sheet) {

		int rc=0;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		    rc=wb.getSheet(sheet).getLastRowNum();
		    
			 // Because the Lastrownnum provide the index of Rows and it starts from 0
			wb.close();
			
			
		} catch (Exception e) {

			//e.printStackTrace();// Always print the error
			
			//always print the message
			
			System.err.println(e.getMessage());//This prints the message in red color
		}
		return rc;

	}
	public static String getCellData(String path, String sheet, int r, int c	) {

		String v=" ";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			v= wb.getSheet(sheet).getRow(r).getCell(c).toString();
			wb.close();
			
			
		} catch (Exception e) {

			//e.printStackTrace();// Always print the error
			
			//always print the message
			
			System.err.println(e.getMessage());//This prints the message in red color
		}
		return v;

	}

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
            
			System.out.println(Demo1.getCellData("./data/TestData.xls", "Sheet1", 0, 0));
			System.out.println(Demo1.getRowCount("./data/TestData.xls", "Sheet1"));
			System.out.println(Demo1.getColumnCount("./data/TestData.xls", "Sheet1", 0));
	}

}

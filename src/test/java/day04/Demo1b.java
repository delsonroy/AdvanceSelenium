package day04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1b {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {

		
		
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Suite.xls"));
		
		int rc=wb.getSheet("Sheet1").getLastRowNum();
		System.out.println(rc);
		int cc=wb.getSheet("Sheet1").getRow(0).getLastCellNum();//This method instead of giving index it gives serial number
		System.out.println(cc);
	}

}

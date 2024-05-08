package day04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1a {

	public static void main(String[] args) throws Exception {

			Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Suite.xls"));
		    int rn=wb.getSheet("Sheet1").getLastRowNum();
		    int rc=wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		    //rn=rn+1;
			for (int i = 0; i <=rn; i++) {
					for (int j = 0; j < rc; j++) {

							String data = wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
							System.out.print(data + " ");
			}
			System.out.println();
		}

	}

}

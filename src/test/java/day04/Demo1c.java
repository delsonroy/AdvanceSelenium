package day04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1c {

	public static void main(String[] args) throws Exception {

		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Suite.xls"));
		int rn = wb.getSheet("Sheet1").getLastRowNum();

		// rn=rn+1;

		for (int i = 0; i <= rn; i++) {
			try {

				int cc = wb.getSheet("Sheet1").getRow(i).getLastCellNum();
				for (int j = 0; j < cc; j++) {
					try {
						String data = wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
						System.out.print(data + " ");
					    }

					catch (Exception e)
					{
						System.out.print("== ");

					}
					

				}
				System.out.println();

			} catch (Exception e) {
		  System.out.println("== ");
			}

		}

	}

}

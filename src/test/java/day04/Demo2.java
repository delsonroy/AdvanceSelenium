package day04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo2 {

	public static void writeToExcel(String path, String sheet, String cellValue, int r, int c) {
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));

			try {
				wb.getSheet(sheet).createRow(r).createCell(c).setCellValue(cellValue);
			} catch (Exception e) {
				wb.getSheet(sheet).createRow(r).createCell(c).setCellValue(cellValue);
			}

			wb.write(new FileOutputStream(path));

			wb.close();
		}

		catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

		Demo2.writeToExcel("./data/TestData.xls", "Sheet1", "Geo", 3, 5);

	}

}

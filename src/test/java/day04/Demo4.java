package day04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo4 {

	

	public static ArrayList<String[]> getSheetDataToList(String path, String sheet)
	{
		
		ArrayList<String[]> list = new ArrayList<String[]>();
        try {
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		
		int rn = wb.getSheet(sheet).getLastRowNum();

		// rn=rn+1;

		for (int i = 1; i <= rn; i++) {
			try {

			int cc = wb.getSheet(sheet).getRow(i).getLastCellNum();
				String[] row = new String[cc];
				for (int j = 0; j < cc; j++) {

					String v = " ";
					try {
						v = wb.getSheet(sheet).getRow(i).getCell(j).toString();

					}

					catch (NullPointerException e) {
						System.err.println(e.getMessage());

					}
					row[j] = v;

				}
				list.add(row);

			} catch (NullPointerException e) {
				System.err.println(e.getMessage());

			}
			

		}
		
		wb.close();
	}
	catch(Exception e)
        {
		System.out.println(e.getMessage());
		}
        return list;
    }

	public static void main(String[] args) throws Exception {
		
		ArrayList<String[]> list = getSheetDataToList("./data/TestData.xls", "Sheet1");

		for (String[] arr : list) {

			for (String val : arr) {

				System.out.print(val + " ");

			}
			System.out.println();
		}

	}
}

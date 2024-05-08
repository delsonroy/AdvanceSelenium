package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
		
	
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
		
	public static void writeToExcel(String path, String sheet,int r, int c, String cellValue) {
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
	

}

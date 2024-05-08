package day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Factory;

public class MySuite4 {

	@Factory
	public Object[] createsuite()throws Exception {

		ArrayList<Object> list = new ArrayList<Object>();
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Suite.xls"));
		int rc = wb.getSheet("Sheet1").getLastRowNum();
		for (int i = 1; i <= rc; i++) 
		{
			String classname = wb.getSheet("Sheet1").getRow(i).getCell(0).toString();
			String classstatus = wb.getSheet("Sheet1").getRow(i).getCell(1).toString();
			System.out.println(classname);
			System.out.println(classstatus);

			if (classstatus.equalsIgnoreCase("yes"))

			  {
				Object obj = null;
				if (classname.equalsIgnoreCase("Demo1"))
				{
					obj = new Demo1();

				} else if (classname.equalsIgnoreCase("Demo2"))
				{
					obj = new Demo2();

				} else if (classname.equalsIgnoreCase("Demo3")) 
				{
					obj = new Demo3();

				}//creating Obj
				list.add(obj);
				
				
			}//first if
			
		}//for loop
		wb.close();
		Object[] allList = list.toArray();
		return allList;
			
		}//method

}//class

package day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Factory;

public class MySuite3 {

	public static void main(String[] args) throws Exception {

		Object[] allTest = new Object[3];
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Suite.xls"));
		int rc = wb.getSheet("Sheet1").getLastRowNum();
		int index = 0;
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

				}
				allTest[index]=obj;
				index++;
			}
		}
			wb.close();
		}

	

	@Factory
	public Object[] createsuite() {

		Object[] allTests = { new Demo1(), new Demo2(), new Demo3() };
		return allTests;

	}

}

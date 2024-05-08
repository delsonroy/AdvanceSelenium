package day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.TestNG;

public class Demo13 {
	
	public static ArrayList<String> getExcelData(String ExcelName) throws Exception
	{
		String packageName=Demo13.class.getPackage().getName();
		ArrayList<String> list= new ArrayList<String>();
		Workbook wb=WorkbookFactory.create(new FileInputStream(ExcelName));
		int rc=wb.getSheet("Sheet1").getLastRowNum();
		
		for(int i=1; i<=rc; i++ )
		{
			String classname=wb.getSheet("Sheet1").getRow(i).getCell(0).toString();
			String run= wb.getSheet("Sheet1").getRow(i).getCell(1).toString();
			if(run.equalsIgnoreCase("yes"))
			{
			list.add(packageName+"."+classname);
			}
		}
		wb.close();
		
		return list;
	}
	
	public static void main(String[] args) throws Exception {

		ArrayList<String> listClass = getExcelData("./data/Suite 2.xls");
		Class[] allclass=new Class[listClass.size()];
		for (int i=0; i<listClass.size(); i++)
		{
		
		String clname = listClass.get(i);
		Class c1=Class.forName(clname);
		allclass[i]=c1;
		}
		TestNG testng= new TestNG();
		testng.setTestClasses(allclass);
		testng.run();	
		
	}

}

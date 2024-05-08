package day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.TestNG;

public class Demo15 {
	
	public static LinkedHashMap<String, String>getExcelData(String ExcelName) throws Exception
	{
		String packageName=Demo15.class.getPackage().getName();
		LinkedHashMap<String, String> map= new 	LinkedHashMap<String, String>();
		Workbook wb=WorkbookFactory.create(new FileInputStream(ExcelName));
		int rc=wb.getSheet("Sheet1").getLastRowNum();
		
		for(int i=1; i<=rc; i++ )
		{
			String data=wb.getSheet("Sheet1").getRow(i).getCell(0).toString();
			String run=wb.getSheet("Sheet1").getRow(i).getCell(1).toString();
			String classname=packageName+"."+data;
			map.put(classname, run);
		}
		wb.close();
		
		return map;
	}
	
	public static void main(String[] args) throws Exception {

		LinkedHashMap<String, String> allClassMap = getExcelData("./data/Suite 2.xls");
		System.out.println(allClassMap);
	    Class[] allclass=new Class[allClassMap.size()];
		
	    int i=0;
	   for(String key:allClassMap.keySet())
	   {
		   allclass[i]=Class.forName(key);
		   i++;
		}
		TestNG testng= new TestNG();
		testng.setTestClasses(allclass);
		testng.run();	
		
	}

}

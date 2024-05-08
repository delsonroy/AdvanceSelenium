package day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.TestNG;

public class MySuite5 {

	public static void main(String[] args) throws Exception {

		ArrayList<Class> list = new ArrayList<Class>();
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Suite.xls"));
		int rc=wb.getSheet("Sheet1").getLastRowNum();
		
		for(int i=1; i<=rc; i++)
		{
			String className=wb.getSheet("Sheet1").getRow(i).getCell(0).toString();
			String classStatus = wb.getSheet("Sheet1").getRow(i).getCell(1).toString();
			
			if(classStatus.equalsIgnoreCase("yes"))
					
					{
				          Class c;
				          if(className.equals("Demo1"))
				          {
				        	      c=Demo1.class;
				          }
				          else if(className.equals("Demo2"))
				          {
				        	  c=Demo2.class;
				        	  
				          }
				          else
				          {
				        	  c=Demo3.class;
				          }		
				          
				          list.add(c);
				
					}
					
		}
		wb.close();
		
		int count= list.size();
		Class[] allTests=new Class[count];
		
		for(int i=0; i<count; i++)
		{
			allTests[i]=list.get(i);
			
		}
		
		TestNG testng= new TestNG();
		testng.setTestClasses(allTests);
		testng.run();
	}

}

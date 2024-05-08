package day03;

import java.util.ArrayList;

import org.testng.TestNG;

public class Demo12 {

	public static void main(String[] args) throws Exception {

		ArrayList<String> lst = new ArrayList<String>();
		lst.add("day03.DemoD");
		lst.add("day03.DemoE");
		lst.add("day03.DemoF");
		int siz=lst.size();
		Class[] allclass = new Class[siz];
		
       for(int i=0; i<siz; i++)
       {
		String cn = lst.get(i);
		Class c1 = Class.forName(cn);
		allclass[i]=c1;
       }

		TestNG testng = new TestNG();

		testng.setTestClasses(allclass);
		testng.run();
	}
}

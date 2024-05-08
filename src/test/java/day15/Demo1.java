package day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.RoboUtil;

public class Demo1 {

	public static void main(String[] args)throws Exception {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
	
		//RoboUtil.enter("java", false);
		//RoboUtil.mouseLocation();
		  RoboUtil.mouseClick(828,364);
	    
		Thread.sleep(2000);
		driver.quit();
	}

}

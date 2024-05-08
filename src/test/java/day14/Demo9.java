package day14;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.RoboUtil;
import utility.Util;

public class Demo9 {

	//DragandDropUsing Robot Class
	
	public static void main(String[] args) throws InterruptedException, Exception {

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().window().maximize();
        Util.getMouseLocation();
//	    driver.quit();
//		Robot r= new Robot();
//		r.mouseMove(405, 405);
//		Thread.sleep(2000);
//		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(2000);
//		r.mouseMove(651, 414);
//		Thread.sleep(2000);
//		r.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
//		
//		Thread.sleep(2000);
//		driver.quit();
		
		RoboUtil.dragAndDrop(405, 405, 678, 414);
	}

}

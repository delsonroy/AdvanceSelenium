package day14;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
         Thread.sleep(5000);
         
         
         Robot r = new Robot();
         
        r.mouseMove(708, 182);
 		r.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Press left mouse button
 		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Release left mouse button

// 		Thread.sleep(1000);
// 		r.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Press left mouse button
// 		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Release left mouse button
// 		
 		//driver.quit();
		
//		Point location = MouseInfo.getPointerInfo().getLocation();
//		double x = location.getX();
//		System.out.println(x);
//		double y = location.getY();
//		System.out.println(y);
		

	}

}

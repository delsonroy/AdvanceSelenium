package day14;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		Robot r = new Robot();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(10000);

		r.mouseMove(360, 200);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Press left mouse button
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Release left mouse button

		Thread.sleep(1000);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Press left mouse button
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Release left mouse button
		
		driver.quit();

	}
}

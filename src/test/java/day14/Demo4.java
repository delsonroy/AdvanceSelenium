package day14;

import java.awt.MouseInfo;
import java.awt.Point;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		
		Point location = MouseInfo.getPointerInfo().getLocation();
		double x = location.getX();
		System.out.println(x);
		double y = location.getY();
		System.out.println(y);
		
		driver.quit();
		
		
		}
	}


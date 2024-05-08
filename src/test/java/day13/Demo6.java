package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	//CommandLineArgs on both side
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Advance%20Selenium/AdvanceSeleniumClass/Demo1.html");
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById(arguments[0]).value=arguments[1]", "username"," Bright");
		
	}

}


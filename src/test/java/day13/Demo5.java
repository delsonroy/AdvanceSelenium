package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	//CommandLineArgs
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Advance%20Selenium/AdvanceSeleniumClass/Demo1.html");
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("alert(arguments[0])", "Delson", "Delma", "Denya");
		js.executeScript("alert(arguments[0]+arguments[1])", "Delson", " Bright");

	}

}


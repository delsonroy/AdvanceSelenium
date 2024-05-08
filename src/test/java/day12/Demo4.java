package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Advance%20Selenium/AdvanceSeleniumClass/Demo1.html");
		String txt=driver.findElement(By.id("username")).getAttribute("value");
	    System.out.println(txt);
	    
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    String text = (String) js.executeScript("return document.getElementById('username').value");
	    System.out.println(text);
	    
	    driver.quit();
	    
	}

}

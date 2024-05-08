package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Advance%20Selenium/AdvanceSeleniumClass/Demo1.html");
		Thread.sleep(2000);
		
//		String text1=driver.findElement(By.id("username")).getAttribute("value");
//		System.out.println(text1);
		
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('username').value=''");
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		

	}

}


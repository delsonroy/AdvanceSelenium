package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Advance%20Selenium/AdvanceSeleniumClass/Demo1.html");
		
		String text1=driver.findElement(By.id("username")).getAttribute("value");
		System.out.println(text1);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String text2="alert(document.getElementById('username').value)";
		js.executeScript(text2);
		

	}

}


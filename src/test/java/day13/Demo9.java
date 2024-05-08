package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import freemarker.core.JavaScriptCFormat;

public class Demo9 {

	//Finding the value using selenium and Passing the valuse using JS
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Advance%20Selenium/AdvanceSeleniumClass/Demo1.html");
		Thread.sleep(1000);
		WebElement unTB = driver.findElement(By.xpath("//input[@id='username']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]", unTB, "Lian");
		
	}

}


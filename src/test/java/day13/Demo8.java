package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	//Finding the value using selenium and Passing the valuse using JS
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Advance%20Selenium/AdvanceSeleniumClass/Demo1.html");
		Thread.sleep(1000);
		driver.findElement(By.name("un")).sendKeys("Prakash");
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].value='Bright'", unTB);
		js.executeScript("document.getElementsByName('un')[0].value='Amelia Maria Delson'"); 
		Thread.sleep(2000);
		driver.quit();
		
	}

}


package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.JSUtil;

public class Demo13 {
//use java script to perform the action
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement unTB=driver.findElement(By.name("username"));
		JSUtil.sendKeys(driver, unTB, "admin");
		
		Thread.sleep(2000);
		
		WebElement pwTB= driver.findElement(By.name("password"));
		JSUtil.sendKeys(driver, pwTB, "admin123");
		Thread.sleep(2000);
		
		WebElement loginBTN=driver.findElement(By.xpath("//button[@type='submit']"));
		JSUtil.click(driver, loginBTN);
		
	}

}

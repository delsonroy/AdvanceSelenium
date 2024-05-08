package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {
//use java script to perform the action
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement unTB=driver.findElement(By.name("username"));
		
		j.executeScript("arguments[0].value=arguments[1]",unTB,"admin");
		WebElement pwTB= driver.findElement(By.name("password"));
		j.executeScript("arguments[0].value=arguments[1]",pwTB,"admin123");
		
		WebElement loginBTN=driver.findElement(By.xpath("//button[@type='submit']"));
		j.executeScript("arguments[0].click()",loginBTN);
	}

}

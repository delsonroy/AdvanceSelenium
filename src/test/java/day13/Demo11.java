package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import freemarker.core.JavaScriptCFormat;

public class Demo11 {

	

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		uname.sendKeys("admin");
//		pwd.sendKeys("admin123");
//		btn.click();
		
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		js.executeScript("arguments[0].value=arguments[1]",uname, "admin");
		
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		js.executeScript("arguments[0].value=arguments[1]",pwd, "admin123");
		
		WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()",btn);
		
		
		
		Thread.sleep(2000);
		//driver.quit();
		
		
		
		
	}
}

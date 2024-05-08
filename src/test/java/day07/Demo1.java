package day07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.Reporter;

public class Demo1 {	
	public static void script(WebDriver driver)	
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin1123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();		
	}
	public static void main(String[] args) {
		WebDriver og_driver = new ChromeDriver();
		EventFiringDecorator<WebDriver> decorator= new 	EventFiringDecorator<WebDriver>(new ReporterListener());
		WebDriver driver = decorator.decorate(og_driver); // takes the ordinal driver and decorats and then give it to us. 
		script(driver);
		
	}

}

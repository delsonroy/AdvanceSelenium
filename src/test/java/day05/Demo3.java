package day05;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Demo3 {

	public static void login(String un,String pw)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Orange"));
		Reporter.log(driver.getTitle(),true);
		driver.quit();
	}
	

	@Test
	public void testA()
	{
		
		int rc=day04.Demo1.getRowCount("./data/TestData.xls", "Sheet2");
		for(int i=1; i<=rc; i++)
		{
		LinkedHashMap<String, String> map = Demo1.getDatatoMap("./data/TestData.xls", "Sheet2", 1);
		String un1=map.get("username");
		String pw2=map.get("password");
		
		
		login(un1, pw2);
	}
}}

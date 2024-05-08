package day05;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import day04.Demo4;

public class Demo2b {

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
		//driver.quit();
	}
	
	@DataProvider
	public Iterator<String[]> getData()
	{
		ArrayList<String[]> list=Demo4.getSheetDataToList("./data/TestData.xls","Sheet2");	
		return list.iterator();
	}
	
	@Test(dataProvider = "getData")
	public void testA(String un,String pw)
	{
		login(un,pw);
	}
}

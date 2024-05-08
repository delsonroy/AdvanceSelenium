package day14;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Util;

public class Demo11 {

	public static void enter(String input,boolean caps)
	{
		try 
		{
			Robot r=new Robot();

			char[] a = input.toUpperCase().toCharArray();
			if(caps)
			{
				r.keyPress(KeyEvent.VK_SHIFT);
			}
			for(char b:a)
			{
				int n=b;
				System.out.println(n);
				r.keyPress(n);
				r.keyRelease(n);
			}
			
			if(caps)
			{
				r.keyRelease(KeyEvent.VK_SHIFT);
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
	
	public static void pressTab()
	{
		try 
		{
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
	
	public static void pressEnter()
	{
		try 
		{
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		enter("admin",true);
		Thread.sleep(1000);
		pressTab();
		enter("admin123",false);
		Thread.sleep(1000);
		pressEnter();
	}

}

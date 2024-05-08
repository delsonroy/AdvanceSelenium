package day19;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Demo3 {
	
	@Parameters({"docker", "browser"})
	@Test
	public void m1(String docker, String browser) throws Exception
	{
		WebDriver driver;
		if(browser.equals("edge"))
		{
			driver= new RemoteWebDriver(new URL(docker), new EdgeOptions());
		}
		else {
		
		driver = new RemoteWebDriver(new URL(docker), new FirefoxOptions());
		
		}	
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);	
		driver.quit();
		
	}

}

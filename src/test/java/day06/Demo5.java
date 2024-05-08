package day06;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class BrowserFactory
{
//In Factory class we usually create static methods
//Here we not only createing objecct but also doing similar activity
	//Here we creating object and it is called as Factory
	
public static WebDriver create(String browser, int time, String url)
{
	WebDriver driver =null;
	browser=browser.toLowerCase();
	switch (browser) 
	{
	
			case "chrome":
				            
				          driver=new ChromeDriver();
				          break;
							
		    case "firefox":
		    	          driver=new FirefoxDriver();
		    	          break;
				
		
			default:
				         driver= new EdgeDriver();
				         break;
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	driver.get(url);
	return driver;

}



}


public class Demo5 {

	public static void main(String[] args) {
		
		BrowserFactory.create("chrome", 10, "https://www.google.com");
		
		
	}

}

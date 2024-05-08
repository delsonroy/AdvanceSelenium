package day18;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo1saucelabs2 {

	public static void main(String[] args) throws Exception {

		URL url= new URL("http://localhost:4444/wd/hub");
		EdgeOptions options = new EdgeOptions();
		
		WebDriver driver=new RemoteWebDriver(url, options);
	    driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		//driver.quit();
	
		}
		
	}



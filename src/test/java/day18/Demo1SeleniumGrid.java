package day18;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo1SeleniumGrid {

	public static void main(String[] args) throws Exception {

		URL url= new URL("https://oauth-delson.geo-e7d53:9bcf8935-7968-486e-ac2f-2bb7a0d959fc@ondemand.us-west-1.saucelabs.com:443/wd/hub");
		EdgeOptions options = new EdgeOptions();
		
		WebDriver driver=new RemoteWebDriver(url, options);
	    driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		//driver.quit();
	
		}
		
	}


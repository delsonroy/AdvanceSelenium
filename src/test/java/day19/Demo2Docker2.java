package day19;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo2Docker2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:5555"), new FirefoxOptions());
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);	
		driver.quit();
	}

}

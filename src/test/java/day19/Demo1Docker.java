package day19;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo1Docker {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), new EdgeOptions());
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}

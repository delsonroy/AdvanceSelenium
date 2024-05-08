package day06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// Singleton class
class Browser {
	private static WebDriver driver = null;

	private Browser() {

	}

	public static WebDriver OpenBrowser() {
		if (driver == null) {
			driver = new ChromeDriver();
			return driver;
		} else {
			
			return driver;
		}

	}
}

public class Demo4 {

	public static void main(String[] args)
	{
		WebDriver driver = Browser.OpenBrowser();	
	}

}

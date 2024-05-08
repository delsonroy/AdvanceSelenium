package day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ScreenShots;

public class Demo9 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actimind.com");
				
		//WebElement element= driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
		//ScreenShots.takeElementScreenshot(element, "./image/element.png");
		ScreenShots.takePageScreenShot(driver, "./image/page.png");
		ScreenShots.takeCompletePageScreenShot(driver,"./image/compltpage.png", 1);
		ScreenShots.takeDesktopScreenshot("./image/desktop.png");
		
		
		
		

	}

}

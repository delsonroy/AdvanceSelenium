package contentoftable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1a {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Advance%20Selenium/WebPage/Sample4.html");

		List<WebElement> allheaders = driver.findElements(By.tagName("th"));
		
		for (WebElement allhead : allheaders) {
			
		  System.out.print(allhead.getText() + "\t");
		}
		
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));

		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));

			for (WebElement cell : cells) {
				System.out.print(cell.getText()+ "\t");

			}
			System.out.println();

		}

	}
}

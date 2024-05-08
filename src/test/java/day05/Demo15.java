package day05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo15 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Advance%20Selenium/WebPage/Sample3.html");
		List<WebElement> allTDs = driver.findElements(By.tagName("td"));

		for (WebElement webElement : allTDs) {

			System.out.println(webElement.getText());

		}

		System.out.println("================");

		WebElement table1 = driver.findElement(By.id("t1"));
		List<WebElement> allTDs2 = table1.findElements(By.tagName("td"));
		for (WebElement webElement2 : allTDs2) {

			System.out.println(webElement2.getText());

		}
		driver.quit();

	}

}

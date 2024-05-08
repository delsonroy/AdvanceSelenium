package day05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Selenium%20Class/Practice%20WebPages/Sample4.html");
		
		WebElement ele = driver.findElement(By.xpath("(//tr)[1]"));
		List<WebElement> ele1 = ele.findElements(By.xpath("//td"));
		
		for (WebElement Element : ele1) {
		
			System.out.println(Element.getText());
		}
		driver.quit();
		

	}

}

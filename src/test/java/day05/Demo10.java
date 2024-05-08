package day05;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class Sample1 {

	@FindAll({@FindBy(id = "t1"),@FindBy(name = "n3"),@FindBy(name = "n2"),@FindBy(name= "n1")})
	private List<WebElement> allElements;

	public Sample1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendInput() throws InterruptedException
	{
		int i=1;
		for (WebElement element : allElements) {
			
			element.sendKeys("delson" +i);
			i++;
			Thread.sleep(2000);
			
		}
	}

}

public class Demo10 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Advance%20Selenium/WebPage/Sample1.html");
		Sample1 s1 = new Sample1(driver);
		s1.sendInput();

	}

}

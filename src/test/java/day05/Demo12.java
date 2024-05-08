package day05;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

class Sample5 {
    
	  //Findall finds all the div element and input element
	@FindAll({@FindBy(tagName = "tr"),@FindBy(tagName = "td")})
	private List<WebElement> allElements;
	
	//Finds all the inout present in the div tag
	@FindBys({@FindBy(xpath="//tr[2]"),@FindBy(tagName="td")}) 
	private List<WebElement> allElements2;

	public Sample5(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void count()
	{
		System.out.println(allElements.size());
	}
	public void count2()
	{
		System.out.println(allElements2.size());
		
	}
	
	public void getTet()
	{
		for (WebElement webElement2 : allElements2) {
			System.out.print(webElement2.getText());
			
			
		}
		
	}
	}



public class Demo12 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Advance%20Selenium/WebPage/Sample3.html");
		Sample5 s5 = new Sample5(driver);
		s5.count();
		s5.count2();
		s5.getTet();

	}

}

package day05;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

class Sample4 {
    
	  //Findall finds all the div element and input element
	@FindAll({@FindBy(tagName = "div"),@FindBy(tagName = "input")})
	private List<WebElement> allElements;
	
	//Finds all the inout present in the div tag
	@FindBys({@FindBy(tagName="div"),@FindBy(tagName="input")}) 
	private List<WebElement> allElements2;

	public Sample4(WebDriver driver) {
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
	}



public class Demo11 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Advance%20Selenium/WebPage/Sample1.html");
		Sample4 s4 = new Sample4(driver);
		s4.count();
		s4.count2();

	}

}

package day05;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class LoginPage2{
	
	
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	
	
	LoginPage2(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);	
	}
	
	void countlinks()
	{
		System.out.println(allLinks.size());
		
	}
}



public class Demo5 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.google.com");
		LoginPage2 l2= new LoginPage2(driver);
		l2.countlinks();
		
		
	}

}

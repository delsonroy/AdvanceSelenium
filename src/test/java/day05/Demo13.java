package day05;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindAll;


class Sample6{
	
@FindBy(tagName="td")
private List<WebElement> allTd;

@FindAll ({@FindBy(tagName="th"),@FindBy(tagName="td")})
private List<WebElement> allTd2;

@FindBys({@FindBy(id = "t1"), @FindBy(xpath = "(//tr[1])[1]"),@FindBy(tagName="th")})
private List<WebElement> allTd3;


public Sample6(WebDriver driver )
{
	PageFactory.initElements(driver, this);
}

public void getData()
{

	for (WebElement elem : allTd2) {
		
		System.out.println(elem.getText());
	}

}
public void getData2()
{

	for (WebElement td1 : allTd3) {
		
		System.out.println(td1.getText());
	}

}
	
}


public class Demo13 {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Advance%20Selenium/WebPage/Sample3.html");
		Sample6 s6 = new Sample6(driver);
		//s6.getData();
		System.out.println("----------");
		s6.getData2();
		driver.quit();

	}

}

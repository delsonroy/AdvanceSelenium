package day05;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

class Sample{
	
	@FindBys({@FindBy(id = "t1"), @FindBy(xpath= ".//th|.//td")})
	
	private List<WebElement> allCells;
	
  Sample(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  void printTable()
  {
	  for (WebElement cell:allCells)
		  
		  System.out.println(cell);
  }
	
}

public class Demo8 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("");
		Sample s=new Sample(driver);
		s.printTable();
		

	}

}

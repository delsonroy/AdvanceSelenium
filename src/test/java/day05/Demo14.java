package day05;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindAll;

class Sample7 {

	
	@FindBys({ @FindBy(id = "t1"), @FindBy(xpath = ".//th|.//td") })
	private List<WebElement> allTd2;

	public Sample7(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void getData() {

		for (WebElement elem : allTd2) {

			System.out.println(elem.getText());
		}

	}

}

public class Demo14 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Advance%20Selenium/WebPage/Sample3.html");
		Sample7 s7 = new Sample7(driver);
		// s6.getData();
		System.out.println("----------");
		s7.getData();
		driver.quit();

	}

}

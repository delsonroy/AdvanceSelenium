package day05;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class LoginPage3 {

	@FindAll({ @FindBy(id = "t1"), @FindBy(name = "n3"), @FindBy(name = "n1"), @FindBy(name = "n2") })
	List<WebElement> allEle;
    
	LoginPage3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	void setups() throws InterruptedException {
		int i = 1;
		for (WebElement element : allEle) {
			element.sendKeys("Delson" + i);
			i++;
			Thread.sleep(2000);
		}
	}
}

public class Demo6 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Advance%20Selenium/WebPage/Sample1.html");
		
		LoginPage3 l3 = new LoginPage3(driver);
		l3.setups();

	}

}

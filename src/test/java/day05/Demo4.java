package day05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class LoginPage{
	
	@FindBy(name="q")
	private WebElement unTB;
	
	LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	void setUsername(String s)
	{
		unTB.sendKeys(s);
	}
	
}


public class Demo4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		LoginPage l = new LoginPage(driver);
		l.setUsername("hello");
		driver.quit();

	}

}

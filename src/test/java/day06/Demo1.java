package day06;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/* Although it is invlaid locator I am not gettin NoSuchElementExcpetion bcs the element is Initialized at the nexk moment and 
 * it is called as Lazy Initialization or LateInitialization
 * 
 */
class LoginPage{
	@FindBy(name="username1")
	private WebElement uname;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void sendUnam()
	{
		//uname.sendKeys("Delson");
	}
	
	
}

 class Demo1 {
	

	@Test
	public void testA()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage d= new LoginPage(driver);
		d.sendUnam();
		
		
	}

}

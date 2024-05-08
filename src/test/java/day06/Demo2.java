package day06;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/*@cachelook up annotations help selenium to rememeber the element address and not need to find again
 * it Increases the speed of the selenium
 * But if the page refereshes we get StaleElementException
 * 
 */
class LoginPage2 {

	@CacheLookup
	@FindBy(name = "username1")
	private WebElement uname;

	public LoginPage2(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void sendUnam() {

		for (int i = 0; i < 50; i++) {
			uname.clear();
			uname.sendKeys("Delson");
		}
	}
	

}

class Demo2 {

	@Test
	public void testA() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage2 d = new LoginPage2(driver);
		d.sendUnam();

	}

}

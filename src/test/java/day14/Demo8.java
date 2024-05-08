package day14;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Robot r = new Robot();
		for (int i = 1; i <= 10; i++) {
			r.mouseWheel(1);
			Thread.sleep(500);
		}
		for (int i = 1; i <= 10; i++) {
			r.mouseWheel(-1);
			Thread.sleep(500);
		}
	}

}

package day08;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Demo3 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actimind.com");
		// ShootingStrategy s = ShootingStrategies.viewportPasting(1000)
		AShot shot = new AShot();
		Screenshot screenshot = shot.takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "png", new File("./image/actimind.png"));
		driver.quit();
		
//		
//		 Screenshot screenshot = new AShot()
//	                .shootingStrategy(ShootingStrategies.viewportPasting(1000))
//	                .takeScreenshot(driver);
//
//	        // Save the screenshot to a file
//	        try {
//	            ImageIO.write(screenshot.getImage(), "PNG", new File("full_page_screenshot.png"));
//	            System.out.println("Full page screenshot captured successfully!");
//	        } catch (Exception e) {
//	            System.err.println("Error occurred while capturing full page screenshot: " + e.getMessage());
//	        }
//		
		

	}

}

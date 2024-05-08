package day08;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws Exception {
		// Take the screenshot of the Desktop
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actimind.com");
		Robot robot = new Robot();
        Rectangle r = new Rectangle(2, 30, 600, 700);
        BufferedImage img = robot.createScreenCapture(r);
        ImageIO.write(img, "png", new File("./image/desktop2.png"));
       
        driver.quit();
		

	}

}

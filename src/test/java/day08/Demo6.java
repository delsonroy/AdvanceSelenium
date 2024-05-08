package day08;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Robot robot = new Robot();
		Dimension desktopsize = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(desktopsize);
        BufferedImage img = robot.createScreenCapture(new Rectangle(desktopsize));
        ImageIO.write(img, "png", new File("./image/desktop3.png"));
       
        driver.quit();
		
		
	}

}

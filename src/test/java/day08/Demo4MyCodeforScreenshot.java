package day08;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Demo4MyCodeforScreenshot {

    // Method to take a screenshot of a specified portion of the webpage
    public static void takeScreenshotOfArea(WebDriver driver, int x, int y, int width, int height, String filePath) {
        try {
            // Take screenshot of the entire page
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Load the screenshot into a BufferedImage
            BufferedImage fullImage = ImageIO.read(screenshotFile);

            // Define the rectangle to crop
            Rectangle cropRect = new Rectangle(x, y, width, height);

            // Crop the screenshot to the defined portion
            BufferedImage croppedImage = fullImage.getSubimage(cropRect.x, cropRect.y, cropRect.width, cropRect.height);

            // Save the cropped screenshot
            File croppedFile = new File(filePath);
            ImageIO.write(croppedImage, "png", croppedFile);
        } catch (IOException e) {
            System.out.println("Error occurred while taking screenshot: " + e.getMessage());
        }
    }

    // Example usage
    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://www.actimind.com");

        // Call the method to take screenshot of the specified area
        takeScreenshotOfArea(driver, 500, 300, 600, 600, "./image/specified_area_screenshot2.png");

        // Quit the WebDriver
        driver.quit();
    }
}

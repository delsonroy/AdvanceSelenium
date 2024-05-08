package contentoftable;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IncludesHeader {
    public static void main(String[] args) {
       

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage containing the table
        driver.get("file:///F:/Advance%20Selenium/WebPage/Sample4.html");
        // Locate the table element
        WebElement table = driver.findElement(By.tagName("table"));

        // Print table header
        List<WebElement> headers = table.findElements(By.tagName("th"));
        for (WebElement header : headers) {
            System.out.print(header.getText() + "\t");
        }
        System.out.println();

        // Get all rows from the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Iterate through each row
        for (WebElement row : rows) {
            // Get all columns within the current row
            List<WebElement> columns = row.findElements(By.tagName("td"));

            // Iterate through each column and print the text
            for (WebElement column : columns) {
                System.out.print(column.getText() + "\t");
            }
            System.out.println(); // Move to the next line after printing all columns in the row
        }

        // Close the browser
        driver.quit();
    }
}

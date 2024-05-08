
package contentoftable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// To print the content of the table in the Sample4
public class Demo1 {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
     //   System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the webpage containing the table
        driver.get("file:///F:/Advance%20Selenium/WebPage/Sample4.html");
        
        // Locate the table element
        WebElement table = driver.findElement(By.tagName("table"));
        
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

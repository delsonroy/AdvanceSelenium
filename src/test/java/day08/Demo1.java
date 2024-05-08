package day08;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws IOException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Google']"));
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dest=new File("./image/google.png");
		FileUtils.copyFile(src, dest);
		
		        

	}

}

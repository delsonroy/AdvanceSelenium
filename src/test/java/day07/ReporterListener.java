package day07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;

public class ReporterListener implements WebDriverListener {
	
	 public void beforeGet(WebDriver driver, String url) {
		 
		 System.out.println("Getting the Url");		 
	 }	 
	  public void afterGet(WebDriver driver, String url) {
		  System.out.println("Url method is completed");
	  }

}

package com.company.MyMavenProject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.SeleniumServer;

public class MyUnit extends Common implements Command {

    public String concatenate(String one, String two){
        return one + two;
    }
    
    public void writetoLocale(){
    	LoadLocaleConstants myLocale = new LoadLocaleConstants();
		myLocale.writetoProperties();
    }
    
    
    public void readLocale(){
    	LoadLocaleConstants myLocale = new LoadLocaleConstants();
		myLocale.ReadfromProperties();
    }
  
//	public void TestStep2() throws Exception {
//	    
//        driver.get("http://www.google.com/webhp?complete=1&hl=en");
//		// Find the text input element by its name
//
//	}
	
	private Command TestSteps2() {
		// TODO Auto-generated method stub
		driver.get("http://www.google.com/webhp?complete=1&hl=en");
		return null;
	}
	
	
	public void testStartSeleniumServer() throws Exception
    {

        Common x = null;
        //passing a method Print
		callCommand(TestSteps2(), "hello world");
      
    }
 
	public void TestMethod() throws Exception {
    
        driver.get("http://www.google.com/webhp?complete=1&hl=en");
		// Find the text input element by its name
  
		WebElement element = driver.findElement(By.name("q"));
		
		// Enter something to search for
		element.sendKeys("Henry Chan");
        TakesScreenshot(driver,"test_hellotest");
		// Now submit the form. WebDriver will find the form for us from the element
		element.submit();
		// Check the title of the page
		//driver.findElement(By.tagName("body")).getText().contains("ABCD");
		driver.getCurrentUrl();
		driver.getPageSource();
		System.out.println("Page title is: " + driver.getTitle());
	}
    
    
    
}
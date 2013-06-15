package com.company.MyMavenProject;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Common extends TestCase implements Command {
  
   // declare fields
	static File pathToBinary = new File("C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
	static FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	static FirefoxProfile firefoxProfile = new FirefoxProfile();
	static WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);  

	public static void TakesScreenshot(WebDriver driver, String FailedAt){
		try{
	    // driver is your WebDriver
	    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	    // screenshot is the file we have acquired
	    // fileName is the name of the image file
	
	        FileUtils.copyFile(screenshot, new File(FailedAt+".jpg"));
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

    //this class runs this object
    public class TestSteps implements Command 
    {
        public void execute(Object data) 
        {
        	driver.get("http://www.google.com/webhp?complete=1&hl=en");
			// Find the text input element by its name
	  
			WebElement element = driver.findElement(By.name("q"));
			
			// Enter something to search for
			element.sendKeys("Henry Chan");
	        TakesScreenshot(driver,"test_hellotest");
			// Now submit the form. WebDriver will find the form for us from the element
			element.submit();
			// Check the title of the page
			driver.findElement(By.tagName("body")).getText().contains("ABCD");
			driver.getCurrentUrl();
			driver.getPageSource();
			System.out.println("Page title is: " + driver.getTitle());
        }    
    }

    //Top function
    public static void callCommand(Command command, Object data) throws Exception 
    {
        try {		

      	  command.execute(data);
      } catch (Exception e) {

          TakesScreenshot(driver,"ABCD");
      	e.printStackTrace();
      }
      
		driver.close();
		
	
    }

	@Override
	public void execute(Object data) {
		// TODO Auto-generated method stub
		
	}

//    public static void main(String... args) throws Exception 
//    {
//        Common x = null;
//        //passing a method Print
//		callCommand(x.new TestSteps(), "hello world");
//    }
//
//	@Override
//	public void execute(Object data) {
//		// TODO Auto-generated method stub
//		
//	}
}
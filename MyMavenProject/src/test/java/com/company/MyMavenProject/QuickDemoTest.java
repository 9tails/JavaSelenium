package com.company.MyMavenProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.opera.core.systems.OperaDriver;


/**
 * Quick Demo Test Case
 * 
 * @author Henry Chan
 */
//@RunWith(Parallelized.class)
public class QuickDemoTest  extends Common implements Command{

	Common Common1 = new Common();
	
//    /**
//     * Parallel testing to run test in multiple browser at the same time
//     * 
//     * @return the collection
//     */
//    @Parameters
//    public static Collection<Object[]> data(){
//        List<Object[]> browsers = new ArrayList<Object[]>();
//	    browsers.add(new String[]{"Firefox"});
//	    browsers.add(new String[]{"Chrome"});
//	    browsers.add(new String[]{"IE"});
//	    return browsers;
//    }

//    /**
//     * Instantiates a new sample suite1.
//     * 
//     * @param type
//     *            the type
//     */
//    public QuickDemoTest(String type){
//        switch (type) {
//		    case "FIREFOX":
//		        driver = new FirefoxDriver();
//		        break;
//		    case "IE":
//		        driver = new InternetExplorerDriver();
//		        break;
//		    case "CHROME":
//		        System.setProperty("webdriver.chrome.driver", "PATHTOCHROMEEXE");
//		        driver = new ChromeDriver();
//		        break;
//		    case "OPERA":
//		        driver = new OperaDriver();
//		        break;
//		    default:
//	        throw new RuntimeException("Browser type unsupported");
//	    }
//	    // Set the timeout.
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//    }



    /**
     * Test title.
     * @throws Exception 
     */
   
    @TestDescription("This method tests the web page title.")
    @Test
    public void testtitleShouldBeGoogle() throws Exception {

		try{
        	 driver.get("http://www.google.com/webhp?complete=1&hl=en");
     		// Find the text input element by its name
       
     		WebElement element = driver.findElement(By.name("q"));
     		
     		// Enter something to search for
     		element.sendKeys("Henry Chan");

     		// Now submit the form. WebDriver will find the form for us from the element
     		element.submit();
     		// Check the title of the page
      		driver.getCurrentUrl();
     		driver.getPageSource();
     		System.out.println("Page title is: " + driver.getTitle());
        	assertEquals(driver.getTitle(), "Google");
        } catch (Exception e) {
        	// Take screenshots on error in jpg format
        	Common.TakesScreenshot(driver,"titleShouldBeGoogle_Error");
        }
    }

    @After
    public void finished(){
    	driver.close();
    }

}

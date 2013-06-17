package com.company.MyMavenProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
public class QuickDemoTest extends Common implements Command{

	@Before
	public void setUp() throws Exception {
		System.out.println("start");
		getDriver().get("http://www.google.com");
	}
	
	 
    /**
     * Test find search box by CSS.
     * @throws Exception 
     */
    @TestDescription("This method tests the web page title.")
    @Test
    public void testFindFieldsbyName() throws Exception {

		try{
        	 getDriver().get("http://www.google.com/webhp?complete=1&hl=en");
     		// Find the text input element by its name
        	WebElement element = getDriver().findElement(By.name("q"));
     		
     		// Enter something to search for
     		element.sendKeys("Henry Chan");

     		// Now submit the form. WebDriver will find the form for us from the element
     		element.submit();
     		
     		// Check the title of the page
     		assertEquals(getDriver().getTitle(), "Google");
  

        } catch (Exception e) {
        	// Take screenshots on error in jpg format
        	Common.TakesScreenshot(getDriver(),"Err_testFindFieldsbyCSS");
        }
    }

    
	@After
	public void tearDown() throws Exception {
		System.out.println("End");
    	getDriver().quit();
	}
}

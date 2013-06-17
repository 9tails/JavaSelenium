package com.company.MyMavenProject;

import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
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
 
	private Command TestSteps2() {
		// TODO Auto-generated method stub
		getDriver().get("http://www.google.com/webhp?complete=1&hl=en");
		return null;
	}
	
	
	public void testStartSeleniumServer() throws Exception
    {
        //passing a method Print
		callCommand(TestSteps2(), "hello world");
    }
 
    /**
     * Test find search box by Name.
     * @throws Exception 
     */
	public static void testFindFieldsbyName() throws Exception {
		try{
        	getDriver().get("http://www.google.com/webhp?complete=1&hl=en");
//      		assertEquals("Google", getDriver().getTitle());
     		// Find the text input element by its name
        	WebElement element = getDriver().findElement(By.name("q"));
     		
     		// Enter something to search for
     		element.sendKeys("Henry Chan");

     		// Now submit the form. WebDriver will find the form for us from the element
     		element.submit();
     		
     		// Check the contains henry and search box is still displayed
     		getDriver().getPageSource().contains("About Dr Henry Chan - Fraxel, Zeltiq - Hong Kong Dermatology");
     		assertTrue(element.isDisplayed());

        } catch (Exception e) {
        	// Take screenshots on error in jpg format
        	Common.TakesScreenshot(getDriver(),"Err_testFindFieldsbyCSS");
        }
    }
    

    /**
     * Test find search box by Xpath.
     * @throws Exception 
     */
	public static void testFindFieldsbyXpath() throws Exception {
		try{
        	getDriver().get("http://www.google.com/webhp?complete=1&hl=en");
//      		assertEquals("Google", getDriver().getTitle());
     		// Find the text input element by its Xpath
        	WebElement element = getDriver().findElement(By.xpath("//input[@class='gbqfif']"));			
     		
        	// Enter something to search for
     		element.sendKeys("Henry Chan");

     		// Now submit the form. WebDriver will find the form for us from the element
     		element.submit();
     		
     		// Check the Url address
     		String actual="http://www.google.com/webhp?complete=1&hl=en#complete=1&hl=en&output=search&sclient=psy-ab&q=Henry+Chan&oq=&gs_l=&pbx=1&bav=on.2,or.r_qf.&bvm=bv.47883778,d.cGE&fp=d320cc8f6176a3c&biw=980&bih=602";
     		assertEquals(actual, getDriver().getCurrentUrl());
        } catch (Exception e) {
        	// Take screenshots on error in jpg format
        	Common.TakesScreenshot(getDriver(),"Err_testFindFieldsbyXpath");
        }
    }
    
    
    /**
     * Test find search box by CSS.
     * @throws Exception 
     */
	public static void testFindFieldsbyCSS() throws Exception {
		try{
        	getDriver().get("http://www.google.com/webhp?complete=1&hl=en");
      		assertEquals("Google", getDriver().getTitle());
     		// Find the text input element by its name
        	WebElement element = getDriver().findElement(By.cssSelector("input.gbqfif"));
     		
     		// Enter something to search for
     		element.sendKeys("Henry Chan");

     		// Now submit the form. WebDriver will find the form for us from the element
     		element.submit();
     		
     		// Check the contains henry and search box is still displayed
     		getDriver().getPageSource().contains("About Dr Henry Chan - Fraxel, Zeltiq - Hong Kong Dermatology");
     		assertTrue(element.isDisplayed());

     		
        } catch (Exception e) {
        	// Take screenshots on error in jpg format
        	Common.TakesScreenshot(getDriver(),"Err_testFindFieldsbyCSS");
        }
    }

    

	
    
    
}
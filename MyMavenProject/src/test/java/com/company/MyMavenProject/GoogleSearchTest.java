package com.company.MyMavenProject;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.SeleniumServer;

import com.opera.core.systems.OperaDriver;
import com.thoughtworks.selenium.DefaultSelenium;

public class GoogleSearchTest extends Common{

	
	 static SeleniumServer server;
	 static WebDriver driver;
      
	//  static Common Common1 = new Common();
	@Test
	public void testStartSeleniumServer() throws Exception
    {
		Common Common1 = new Common();
		
//		Common1.BaseFn();

    }

	
	
//	
//    @BeforeClass
//    public static void setUpBeforeClass() throws Exception {
//      
//    	//Start the server
//        try {
//            server = new SeleniumServer();
//            server.start();
//            
//            
////            DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.google.com");
////            DesiredCapabilities capability = DesiredCapabilities.firefox();
////  //          driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
//            
////            // Setting up the Selenium Client for the duration of the tests
////            HtmlUnitDriver selenium = new HtmlUnitDriver();
////            selenium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            
//         
//File pathToBinary = new File("C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
//FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
//FirefoxProfile firefoxProfile = new FirefoxProfile();
// driver = new FirefoxDriver(ffBinary,firefoxProfile);
//
////            // We could use any driver for our tests...
////            DesiredCapabilities capabilities = new DesiredCapabilities();
////
////            // ... but only if it supports javascript
////            capabilities.setJavascriptEnabled(true);
////
////            // Get a handle to the driver. This will throw an exception
////            // if a matching driver cannot be located
////            driver = new RemoteWebDriver(capabilities);
////
////            // Query the driver to find out more information
////            Capabilities actualCapabilities = ((RemoteWebDriver) driver).getCapabilities();
//
//  
//            // And now use it
//          //  driver.get("http://www.google.com");
//        } catch (Exception e) {
//  
//        
//            //Stop the server from port 4444 from previous attempts
//            server.stop();
//            // TODO Auto-generated catch block
//            System.out.println("Failed to start the server");
//            e.printStackTrace();
//        }
//        
//      //  setUpUrl();
//   
//     
//    }
//    
//    
//    
//    
////    beforeAll() {
////        // Setting up the jetty instance which will be running the
////        // GUI for the duration of the tests
////        server  = new Server(GUI_PORT)
////        val context = new WebAppContext()
////        context.setServer(server)
////        context.setContextPath("/")
////        context.setWar("src/main/webapp")
////        server.addHandler(context)
////        server.start()
////
////        // Setting up the Selenium Client for the duration of the tests
////        selenium = new HtmlUnitDriver();
////        selenium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////      }
//   /**
//         * Data.
//         * 
//         * @return the collection
//         */
//        @Parameters
//        public static Collection<Object[]> data(){
//              List<Object[]> browsers = new ArrayList<Object[]>();
//        browsers.add(new String[]{"Firefox"});
//        browsers.add(new String[]{"Chrome"});
//        browsers.add(new String[]{"IE"});
//        return browsers;
//        }
//        
//        /**
//         * Instantiates a new sample suite1.
//         * 
//         * @param type
//         *            the type
//         * @return 
//         */
//        public void GoogleSearchTest(String type){
//            switch (type) {
//        case "FIREFOX":
//            driver = new FirefoxDriver();
//            break;
//        case "IE":
//            driver = new InternetExplorerDriver();
//            break;
//        case "CHROME":
//            System.setProperty("webdriver.chrome.driver", "PATHTOCHROMEEXE");
//            driver = new ChromeDriver();
//            break;
//        case "OPERA":
//            driver = new OperaDriver();
//            break;
//        default:
//            throw new RuntimeException("Browser type unsupported");
//        }
//        // Set the timeout.
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        }
//
//        /**
//         * Setup.
//         */
//  
//        public static void setUpUrl() {
//        	
//        	  driver.get("http://www.google.com");
//        } 
//        
//        
//    @AfterClass
//    public static void tearDownAfterClass() throws Exception {
//        driver.close();
//        //Stop the server
//        server.stop();
//    
//    
//    }   
//    
//    
//    /**
//     * Test title.
//     * @throws Exception 
//     */
//    @Test
//    @TestDescription("This method tests the web page title.")
//    public void titleShouldBeGoogle() throws Exception {
//        try{
//        	
//        	
//        	driver.get("http://www.google.com/webhp?complete=1&hl=en");
//			// Find the text input element by its name
//			
//			WebElement element = driver.findElement(By.name("q"));
//			
//			// Enter something to search for
//			element.sendKeys("Henry Chan");
//			
//			// Now submit the form. WebDriver will find the form for us from the element
//			element.submit();
//		
//        	assertEquals(driver.getTitle(), "Google");
//        } catch (Exception e) {
//            
//        	Common1.TakesScreenshot(driver);
//        }
//    }

    
//    @Test
//    public void testGoogleSearch(){
//              //To implement Selenium Tests here
//    }
//   
//    @Test
//    public void testGoogleAdvancedSearch(){
//            //To implement Selenium Tests here
//    } 
}
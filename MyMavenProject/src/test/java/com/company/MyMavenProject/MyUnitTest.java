package com.company.MyMavenProject;
import java.io.IOException;

import junit.framework.TestCase;
////import java.net.ServerSocket;
//import java.net.Socket;
//import java.net.UnknownHostException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.Description;

import static org.junit.Assert.*;

public class MyUnitTest {

//	@Before
//	public void setUp() throws Exception {
//		System.out.println("start");
//		getDriver().get("http://www.google.com");
//	}
	
    @BeforeClass
	public static void setUpClass() throws Exception {
		System.out.println("start");
		MyUnit.getDriver().get("http://www.google.com");
	}
	
	@Test
    public void testSearchName() throws Exception {
		MyUnit.testFindFieldsbyName();
	}
	
	@Test
    public void testSearchxPath() throws Exception {
		MyUnit.testFindFieldsbyXpath();
	}
	@Test
    public void testSearchCSS() throws Exception {
		MyUnit.testFindFieldsbyCSS();
	}
	
//	@After
//	public void tearDown() throws Exception {
//		System.out.println("End");
//		MyUnit.getDriver().quit();
//	}	

	
	@AfterClass
	public static void tearDownClass() throws Exception {
		System.out.println("End");
		MyUnit.getDriver().quit();
	}
    
    

}
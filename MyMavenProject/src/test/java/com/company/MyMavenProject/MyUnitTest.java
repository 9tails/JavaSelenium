package com.company.MyMavenProject;
import java.io.IOException;

import junit.framework.TestCase;
////import java.net.ServerSocket;
//import java.net.Socket;
//import java.net.UnknownHostException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.Description;

import static org.junit.Assert.*;

public class MyUnitTest {


//	    public MyUnitTest watchman= new MyUnitTest() {
//	     
//	        protected void failed(Description d) {
//	            // take screenshot here
//	        }
//	    };
//
//	    @Test
//	    public void fails() {
//	        fail();
//	    }
//
//	    protected void failed(Description d) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Test
//	    public void succeeds() {
//	    }

   // @SuppressWarnings("unused")
//	private Socket clientSocket;

//	@Test
//    public void testRead() throws IOException, IOException {
//        MyUnit myUnit = new MyUnit();
//        myUnit.readLocale();
//    }
	
//	@Test
//    public void testWrite() throws IOException, IOException {
//        MyUnit myUnit2 = new MyUnit();
//        myUnit2.writetoLocale();
//	}	
	
	
//	@Test
//    public void testStartSeleniumServer() throws Exception {
//		 MyUnit myUnit3 = new MyUnit();
//		 myUnit3.testStartSeleniumServer();
//	}
	
	@Test
    public void testTestMethod() throws Exception {
		 MyUnit myUnit4 = new MyUnit();
		 myUnit4.TestMethod();
	}
	
//	@Test
//    public void testConcatenate() throws IOException, IOException {
//		
//		ServerSocket serverSocket = new ServerSocket(4444);
//		clientSocket = new Socket("localhost", 4444);
//		assertEquals("onetwo", result);
//
//	
//	}
		
	
}
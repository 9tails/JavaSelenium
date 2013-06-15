package com.company.MyMavenProject;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
 
public class LoadLocaleConstants 
{
	private static String A;	
	private static int B;
	private static String EMAIL;
	
	public void setVariableA(String s)
	{
	    A = s;
	}

	public String getVariableA()
	{
	    return A;
	}
	
	public void setVariableB(int s)
	{
	    B = s;
	}

	public int getVariableB()
	{
	    return B;
	}
	
	public void setEmail(String s)
	{
		EMAIL = s;
	}

	public String getEmail()
	{
	    return EMAIL;
	}
	
	public void writetoProperties(){
		Properties prop = new Properties();
		 
    	try {
    		//set the properties value
    		prop.setProperty("database", "localhost");
    		prop.setProperty("dbuser", "henryc");
    		prop.setProperty("dbpassword", "password");
 
    		//save properties to project root folder
    		prop.store(new FileOutputStream("config.properties"), null);
 
    	} catch (IOException ex) {
    		ex.printStackTrace();
        }
	}
	
	public void ReadfromProperties(){

    	Properties prop = new Properties();
 
    	try {
               //load a properties file
    			prop.load(new FileInputStream("config.properties"));
    			setEmail(prop.getProperty("gmailPassword"));
    			
               //get the property value and print it out
                System.out.println(prop.getProperty("database"));
	    		System.out.println(prop.getProperty("dbuser"));
	    		System.out.println(prop.getProperty("dbpassword"));
	 
    	} catch (IOException ex) {
    		ex.printStackTrace();
        }
	 
	}
	
	
    public static void main( String[] args )
    {
    //prop.load(getClass().getClassLoader().getResourceAsStream("config.properties");))	
    }
}
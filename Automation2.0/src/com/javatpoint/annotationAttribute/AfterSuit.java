package com.javatpoint.annotationAttribute;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class AfterSuit {
	@AfterSuite  
	public void after_suite()  
	{  
	    System.out.println("Last method");  
	      
	}  
	@AfterSuite  
	@Test  
	public void a_test()  
	{  
		System.out.println("Test1");  
	}  
	@Test  
	public void b_test()  
	{  
		System.out.println("Test2");  
	}  
	@Test  
	public void c_test()  
	{  
	    System.out.println("Test3");  
	}  
}

/*@AfterSuite: The @AfterSuite annotated method is executed after the execution of all the test methods in the Suite. 
 * The Suite is basically a testng.xml file so we can say that @AfterSuite annotated method is executed after the 
 * execution of an XML file.
 * The @BeforeSuite annotation is used to set up or start the selenium drivers while the @AfterSuite annotation is used 
 * to stop the selenium web drivers.
 */
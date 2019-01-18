package com.sundaniu.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sundaniu.commonobject.UseBrowser;
import com.sundaniu.pageobject.HomePageObject;
import com.sundaniu.pagepath.TestProperties;

public class SeleniumLoginTest {
	WebDriver drivers;
	HomePageObject page;
	UseBrowser browser = new UseBrowser();
	
	TestProperties prpt=new TestProperties("src/property.properties");
	String userName="111";
	String passWord="111";
	String name="²âÊÔ";
	String age="18";
	String eidtname="²âÊÔÐÞ¸Ä";
	String eidtAge="233";
	//µÇÂ½
	 @Test(priority=0)
	public void testLogin() {
		//µÇÂ½
		page.input(prpt.getProperties("userName"), userName);
		
		page.input(prpt.getProperties("passWord"), passWord);
		
		page.click(prpt.getProperties("login"));
		
	}
	 
	 	//Ìí¼Ó
	 	@Test(priority=1)
		public void addTest(){
		//Ìí¼Ó
			page.click(prpt.getProperties("addStudent"));
			
			page.input(prpt.getProperties("name"), name);
			
			page.input(prpt.getProperties("age"), age);
			
			page.click(prpt.getProperties("sub"));
			
		}
	 
	 	@Test(priority=2)
		public void queryTest(){
			//²éÑ¯
			
			page.input(prpt.getProperties("queryName"), name);
			
			page.click(prpt.getProperties("querySub"));
			
		}
	 
		//ÐÞ¸Ä
	 
	 	@Test(priority=3)
	 	public void editTest(){
			//ÐÞ¸Ä
			
			page.click(prpt.getProperties("eidtStudent"));
			
			page.input(prpt.getProperties("name"), eidtname);
			
			page.input(prpt.getProperties("age"), eidtAge);
			
			page.click(prpt.getProperties("sub"));
			
			
		}
	 
		//É¾³ý
	 	@Test(priority=4)
	 	public void delectTest(){
		//É¾³ý
		page.click(prpt.getProperties("delectStudent"));
				
		 page.alert();
		
	}
	

	@BeforeMethod
	  public void beforeMethod() {
	      System.out.println("Before method success....");
	     
	  }

	  @AfterMethod
	  public void afterMethod() {
	      System.out.println("After Method success....");
	  }

	  @BeforeClass
	  public void beforeClass() {
	      System.out.println("Before Class success....");
	  }

	  @AfterClass
	  public void afterClass() {
	      System.out.println("After Class success....");
	  }

	  @BeforeTest
	  public void beforeTest() {
	      System.out.println("Before Test success....");
	  }

	  @AfterTest
	  public void afterTest() {
	      System.out.println("After Test success....");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
	      drivers = browser.setupChrome("http://112.74.190.69/student/");
	      page  =new HomePageObject(drivers);
	      System.out.println("Before Suite success....");
	  }

	  @AfterSuite
	  public void afterSuite() {
	 //     browser.closeBrowser();
		  drivers.close();
	      System.out.println("After Suite success....");
	  }
	
}

package com.TestNG;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class AnnotationsDemo {

	//below is the sequence of annotations	
	//preconditions annotations---starting with @Before
	@BeforeSuite//
	public void setUp() {
	System.out.println("setup system property for chrome");
	}
		
	@BeforeTest
	public void launchBrowser() {
	System.out.println("launch chrome Browser");
	}

	@BeforeClass//used to execute the method before executing test class
	public void login() {
	System.out.println("login to app");
	}
	@BeforeMethod//used to execute the method before execution of every test method, declared with @Test
	public void enterURL () {
	System.out.println("enter URL");
	}

	//test cases--starting with @Test
	@Test//invocationCount is a keyword that helps to execute test cases multiple times.@Test used to execute the test method
	public void googleTitleTest() {
	System.out.println("Google Title Test");
	}
	@Test
	public void homePageTest(){
	System.out.println("Home Page Test");	
	}
	//post conditions--staring with After 
	@AfterMethod//used to execute the method after execution of every test method
	public void logout() {
	System.out.println("logout from app");
	}

	@AfterClass//used to execute the method after executing the test class
	public void closeBrowser() {
	System.out.println("Close Browser");
	}

	@AfterSuite
	public void generateTestReport() {
	System.out.println("Generate Test Report");

	}
	@AfterTest
	public void deleteAllCookies() {
	System.out.println("delete all cookies");
	}
	}

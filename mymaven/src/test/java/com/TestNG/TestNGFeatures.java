package com.TestNG;

import org.testng.annotations.Test;

public class TestNGFeatures {

@Test
public void loginTest() {
System.out.println("login Test");		
}

@Test(dependsOnMethods = "loginTest")
public void HomePageTest() {
	System.out.println("home page test");
}
}

package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

WebDriver driver;

@BeforeMethod
public void setUp() {
ChromeOptions options = new ChromeOptions();

options.addArguments("--remote-allow-origins=*");
System.setProperty("Webdriver.chrome.driver","C:\\Users\\mauli\\Downloads\\chromedriver_win32//chromedriver.exe");
WebDriver driver = new ChromeDriver(options);
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("http://www.google.com");
}

@Test
public void googleTitleTest() {
String title = driver.getTitle();
System.out.println(title);

}

@Test
public void googleLogoTest() {
Boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
}
	
@AfterMethod
public void tearDown() {
driver.quit();
}
	
}

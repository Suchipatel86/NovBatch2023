package apachidemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NewTestNG {
	

 @Test
 
  public void item() {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[normalize-space()='Gift Cards']")).click();


	  
	  
  }
}

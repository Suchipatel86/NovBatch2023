package apachidemo;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ExcelDemo {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();//ChromeOptions is a class in Selenium which is used to set the capability,customization and configuration of the ChromeDriver session. 
			                                    //It also manipulates different properties of the WebDriver, like its name, browser platform etc.
		options.addArguments("--remote-allow-origins=*");

		//System.setProperty("Webdriver.chrome.driver","C:\\Users\\mauli\\Downloads\\chromedriver_win32//chromedriver.exe");
		
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.facebook.com/");
	WebElement username = driver.findElement(By.id("email"));
	String path = "C:\\Users\\mauli\\OneDrive\\Desktop\\Excel.xlsx\\";
    FileInputStream file = new FileInputStream(path);
 String a = WorkbookFactory.create(file).getSheet("Data").getRow(0).getCell(1).getStringCellValue();
   username.sendKeys(a);
	

	}

}

package login_page_test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pages.BrowserFactory;

/**
 * @author Ravinder Singh
 *
 */

public class HelperClass {
	public static WebDriver driver;
	BrowserFactory objBrowser;
	
	public HelperClass() {
		
	}
	@BeforeSuite
	public void beforeSuite() {
	
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("in @BeforeClass");	
	}
	
	@BeforeMethod
	public void beforeMethodClass() {
		System.out.println("in @BeforeMethodClass");
		HelperClass.driver = BrowserFactory.getDriver("Chrome");
	}
	
	@AfterSuite
	public void afterSuite() throws IOException{
		driver.quit();
	}
}

package login_page_test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BrowserFactory;
import pages.CaptureScreenShot;
import pages.User_Details;
import pages.login_page;

/**
 * @author Ravinder Singh
 *
 */
public class loginPageTest extends HelperClass {

	//Login to Website with correct credentials --TC_001
	@Test
	public void TC_001() throws InterruptedException {
		try {
			driver.get("https://www.saucedemo.com/");
			login_page loginPage = PageFactory.initElements(driver,login_page.class);

			//login the application
			loginPage.loginToSite(User_Details.VALID_USERNAME, User_Details.VALID_PASSWORD);

			String testResultFile = System.getProperty("user.dir")+"\\Screenshots\\"+ "Success_Screenshot_TC001_" 
					+CaptureScreenShot.getDateTimeStamp()+".png";
			try {
				CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), testResultFile);		
			} 
			catch (Exception e) {
				e.printStackTrace();
			}

			//Verify Home Page
			Assert.assertTrue(loginPage.getURL().equals("https://www.saucedemo.com/inventory.html"));
		}catch (Exception e){
			e.printStackTrace();
			Assert.assertFalse(true);
			String testResultFile = System.getProperty("user.dir")+"\\Screenshots\\"+ "Failure_Screenshot_TC001_" 
					+CaptureScreenShot.getDateTimeStamp()+".png";
			try {
				CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), testResultFile);		
			}
			catch (Exception E) {
				E.printStackTrace();
			}
		}

	}
	
	//Login to Website with incorrect credentials --TC_002
	@Test
	public void TC_002() throws InterruptedException {
		try {
			driver.get("https://www.saucedemo.com/");
			login_page loginPage = PageFactory.initElements(driver,login_page.class);

			//login the application
			loginPage.loginToSite(User_Details.InVALID_USERNAME, User_Details.InVALID_PASSWORD);

			String testResultFile = System.getProperty("user.dir")+"\\Screenshots\\"+ "Success_Screenshot_TC002_" 
					+CaptureScreenShot.getDateTimeStamp()+".png";

			try {
				CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), testResultFile);		
			} 
			catch (Exception e) {
				e.printStackTrace();
			}

			Assert.assertTrue(loginPage.getErrorText().equals("Epic sadface: Username and password do not match any user in this service"));

		}catch (Exception e){
			e.printStackTrace();
			Assert.assertFalse(true);
			String testResultFile = System.getProperty("user.dir")+"\\Screenshots\\"+ "Failure_Screenshot_TC002_" 
					+CaptureScreenShot.getDateTimeStamp()+".png";
			try {
				CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), testResultFile);		
			} 
			catch (Exception E) {
				E.printStackTrace();
			}
		}	
	}
	
	//Login to Website with Correct USERNAME but incorrect PASSWORD --TC_003
	@Test
	public void TC_003() throws InterruptedException {
		try {
			driver.get("https://www.saucedemo.com/");
			login_page loginPage = PageFactory.initElements(driver,login_page.class);

			//login the application
			loginPage.loginToSite(User_Details.VALID_USERNAME, User_Details.InVALID_PASSWORD);

			String testResultFile = System.getProperty("user.dir")+"\\Screenshots\\"+ "Success_Screenshot_TC003_" 
					+CaptureScreenShot.getDateTimeStamp()+".png";

			try {
				CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), testResultFile);		
			} 
			catch (Exception e) {
				e.printStackTrace();
			}

			Assert.assertTrue(loginPage.getErrorText().equals("Epic sadface: Username and password do not match any user in this service"));

		}catch (Exception e){
			e.printStackTrace();
			Assert.assertFalse(true);
			String testResultFile = System.getProperty("user.dir")+"\\Screenshots\\"+ "Failure_Screenshot_TC003_" 
					+CaptureScreenShot.getDateTimeStamp()+".png";
			try {
				CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), testResultFile);		
			} 
			catch (Exception E) {
				E.printStackTrace();
			}
		}	
	}

	//Login to Website with incorrect USERNAME but correct PASSWORD --TC_004
	@Test
	public void TC_004() throws InterruptedException {
		try {
			driver.get("https://www.saucedemo.com/");
			login_page loginPage = PageFactory.initElements(driver,login_page.class);

			//login the application
			loginPage.loginToSite(User_Details.InVALID_USERNAME, User_Details.VALID_PASSWORD);

			String testResultFile = System.getProperty("user.dir")+"\\Screenshots\\"+ "Success_Screenshot_TC004_" 
					+CaptureScreenShot.getDateTimeStamp()+".png";

			try {
				CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), testResultFile);		
			} 
			catch (Exception e) {
				e.printStackTrace();
			}

			Assert.assertTrue(loginPage.getErrorText().equals("Epic sadface: Username and password do not match any user in this service"));

		}catch (Exception e){
			e.printStackTrace();
			Assert.assertFalse(true);
			String testResultFile = System.getProperty("user.dir")+"\\Screenshots\\"+ "Failure_Screenshot_TC004_" 
					+CaptureScreenShot.getDateTimeStamp()+".png";
			try {
				CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), testResultFile);		
			} 
			catch (Exception E) {
				E.printStackTrace();
			}
		}	
	}

	//Login to Website with locked out user's credentials --TC_005
	@Test
	public void TC_005() throws InterruptedException {
		try {
			driver.get("https://www.saucedemo.com/");
			login_page loginPage = PageFactory.initElements(driver,login_page.class);

			//login the application
			loginPage.loginToSite(User_Details.LOCKED_OUT_USER, User_Details.VALID_PASSWORD);

			String testResultFile = System.getProperty("user.dir")+"\\Screenshots\\"+ "Success_Screenshot_TC005_" 
					+CaptureScreenShot.getDateTimeStamp()+".png";

			try {
				CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), testResultFile);		
			} 
			catch (Exception e) {
				e.printStackTrace();
			}

			Assert.assertTrue(loginPage.getErrorText().equals("Epic sadface: Sorry, this user has been locked out."));

		}catch (Exception e){
			e.printStackTrace();
			Assert.assertFalse(true);
			String testResultFile = System.getProperty("user.dir")+"\\Screenshots\\"+ "Failure_Screenshot_TC005_" 
					+CaptureScreenShot.getDateTimeStamp()+".png";
			try {
				CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), testResultFile);		
			} 
			catch (Exception E) {
				E.printStackTrace();
			}
		}


	}

	//Login button press without credentials --TC_006
	@Test
	public void TC_006() throws InterruptedException {
		try {
			driver.get("https://www.saucedemo.com/");
			login_page loginPage = PageFactory.initElements(driver,login_page.class);

			//login the application
			loginPage.clickLogin();

			String testResultFile = System.getProperty("user.dir")+"\\Screenshots\\"+ "Success_Screenshot_TC006_" 
					+CaptureScreenShot.getDateTimeStamp()+".png";

			try {
				CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), testResultFile);		
			} 
			catch (Exception e) {
				e.printStackTrace();
			}

			Assert.assertTrue(loginPage.getErrorText().equals("Epic sadface: Username is required"));

		}catch (Exception e){
			e.printStackTrace();
			Assert.assertFalse(true);
			String testResultFile = System.getProperty("user.dir")+"\\Screenshots\\"+ "Failure_Screenshot_TC006_" 
					+CaptureScreenShot.getDateTimeStamp()+".png";
			try {
				CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), testResultFile);		
			} 
			catch (Exception E) {
				E.printStackTrace();
			}
		}
	}
}

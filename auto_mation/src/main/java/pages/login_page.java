package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Ravinder Singh
 *
 */
public class login_page {
	WebDriver driver;
	By username = By.name("user-name");
	By password = By.name("password");
	By login = By.name("login-button");
	By error_button = By.cssSelector("html body div#root div div.login_wrapper div.login_wrapper-inner div#login_button_container.form_column div.login-box form div.error-message-container.error h3");

	public login_page(WebDriver driver) {
		this.driver = driver;
	}

	//To set username in textbox
	public void setUserName(String strUserName) {
		driver.findElement(username).sendKeys(strUserName);
	}
	//TO set password in textbox
	public void setPassword(String strPassword) {
		driver.findElement(password).sendKeys(strPassword);
	}
	//To click login button
	public void clickLogin() {
		driver.findElement(login).click();
	}
	public String getURL() {
		return driver.getCurrentUrl();
	}
	
	public String getErrorText() {
		String errorText = driver.findElement(error_button).getText();
			System.out.println("errorText =" + errorText);
			return errorText;
	}

	public void loginToSite(String strUserName,String strPassword) throws InterruptedException {
		//Fill the username
		this.setUserName(strUserName);
		//fill the password
		this.setPassword(strPassword);
		//click the login button
		this.clickLogin();
	}
}

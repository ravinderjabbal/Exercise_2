# Website login page automaiton --> Exercise -2
Scenario Provided :: Automation of 6 of the test cases that  written for provided exercise using Selenium WebDriver with Java  and a web automation framework of your choice. 
# Problem :
Test cases to validate all possible scenarios related to the Login feature. For this test we will utilize a website created by Swag Labs meant to facilitate QA assignments. The website can be located here: https://www.saucedemo.com 

# Important Notes Followed :
- The automated tests should be executable on Windows 
- All the automated tests built should be executed on Chrome (latest)
- Automation test results should be generated after each run (.html, .xml) 
- Automation results should include screenshots in case of passed/failed tests. 

- Test Cases with detailed steps are uploaded as **"Exercise_1.xls"**
- Test Cases used for Excercise 2 are named after Test Case ID mentioned in **"Exercise_1.xls"**, so that reader should go through **"Exercise_1.xls"** for better understading of automation Test cases.
- Only Top 6 test cases are automated.
- Maven is used to dynamically downloads Java libraries and Selenium/TestNG related dependencies.
- **ChromeDriver.exe** and **GeckoDriver.exe** already included in project.

# Classes created :

### BrowserFactory : 
- Created for dynamic utilization of supported browser(Chrome,Firefox), so its not required to define or set browser for each and evry Test case.
- Chrome will be used as  default browser.

### CaptureScreenShot :
- Created to capture and save screenshots whether the Test Case is Pass or Fail.

### login_page:
- Main class where all the webelements are captured and will be utilized while testing.
	
### User_Details: 
- Class where all the credentials are stored so the use of hard-coded values are reduced.

### HelperClass :
- As the name suggest this is the helper class which will be utilized to run the methods Pre/Post of Suite/Class/Method or in simple terms it will be used for setup and cleaning task.

### loginPageTest :
- This is the main class having all the 6 test cases to be performed on Login Page of provided test website.
- This class consist test cases with the following summary
	- Login to Website with correct credentials --TC_001
	- Login to Website with incorrect credentials  --TC_002
	- Login to Website with Correct USERNAME but incorrect PASSWORD --TC_003
	- Login to Website with incorrect USERNAME but correct PASSWORD --TC_004
	- Login to Website with locked out user's credentials --TC_005
	- Login button press without credentials --TC_006

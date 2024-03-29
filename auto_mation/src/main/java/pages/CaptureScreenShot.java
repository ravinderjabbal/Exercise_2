package pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

/**
 * @author Ravinder Singh
 *
 */
public class CaptureScreenShot {
	public CaptureScreenShot() {

	}

	public static void getScreenShot(WebDriver driver, String filePath) {
		try {
			System.out.println("In getScreenShot method");
			TakesScreenshot TS = (TakesScreenshot)driver;
			System.out.println("before getScreenshotAs");
			File source = TS.getScreenshotAs(OutputType.FILE);
			System.out.println("After getScreenshotAs");
			FileUtils.copyFile(source, new File(filePath));
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String getDateTimeStamp(){
		Date oDate;
		String[] sDatePart;
		String sDateStamp;
		oDate = new Date();
		System.out.println(oDate.toString());
		sDatePart = oDate.toString().split(" ");
		sDateStamp = sDatePart[5] + "_" +
				sDatePart[1] + "_" +
				sDatePart[2] + "_" +
				sDatePart[3] ;
		sDateStamp = sDateStamp.replace(":", "_");
		System.out.println(sDateStamp);
		return sDateStamp;}

}

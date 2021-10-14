package com.training.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected static WebDriver driver;

	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	 public static void launchapplication(){
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			driver.manage().window().maximize();
	 }
	public static void takescreenshot(WebDriver driver) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

		Date currentDate = new Date();
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(currentDate);
		String fileSeperator = System.getProperty("file.separator");
		String reportFilepath = System.getProperty("user.dir") + fileSeperator + "Screenshots";
		String reportFileName = "ScreenShot" + timestamp + ".png";
		String filePath = reportFilepath + fileSeperator + reportFileName;
		File DestFile = new File(filePath);
		FileUtils.copyFile(srcFile, DestFile);
	}
	public void selectByVisibleText(WebElement element, String string) {
		if(element.isEnabled());
		System.out.println(element);
		
	}
	
	
		 
	//Clear Method
	
	public  void clear(WebElement element) {
		element.clear();
		
	}
	
	//Radio Button Method
	
	protected void Radiobutton(WebElement element, String string) {
		element.click();
		
	}
	/*
	 * name of the method: entertext
	 * 
	 * BriefDescription : entering textvalue for textbox
	 */
	

	public static void enterText(WebElement obj, String textval, String objName) throws Exception

	{
		if (obj.isDisplayed())

		{

			Thread.sleep(4000);

			obj.sendKeys(textval);

			System.out.println("pass: " + textval + "value is entered in " + objName + "field");

			// Call take screenshot function

			// logger.log(LogStatus.PASS,textval+"value is entered in "+objName+"field");

		}

		else

		{

			System.out.println("fail:" + objName + "field does not exist please check application");

			// logger.log(LogStatus.FAIL,textval+objName+"field does not exist please check
			// application");

		}

	}

	/*
	 * name of the method: clickobject--->Button
	 * 
	 * BriefDescription : clicking a button
	 * 
	 * Arguments : obj-->object,objName--->object name
	 */

	public static void clickObj(WebElement obj, String objName)

	{

		if (obj.isDisplayed())

		{

			obj.click();

			System.out.println("pass :" + objName + "button is clicked");

			// logger.log(LogStatus.PASS, objName+ "button is displayed ,please check the
			// application");

		}

		else

		{

			System.out.println("Fail:" + objName + "button is not displayed ,please check the application");

			// logger.log(LogStatus.FAIL, objName+ "button is not displayed ,please check
			// the application");

		}

	}

	/*
	 * Name of the method: selectCheckBox
	 * 
	 * Brief Description: Select the checkbox
	 * 
	 * Arguments: obj --> web object, objName--> name of the object
	 */

	public static void selectCheckBox(WebElement obj, String objName) {

		if (obj.isDisplayed()) {

			if (obj.isSelected()) {

				System.out.println("Pass: " + objName + " is already selected");

				// logger.log(LogStatus.INFO, objName + "is already selected");

			} else {

				obj.click();

				System.out.println("Pass: " + objName + " is selected");

				// logger.log(LogStatus.PASS, objName + "is selected");

			}
		}

		else {

			System.out.println("Fail:" + objName + " is not present.Please chk application");

			// logger.log(LogStatus.FAIL, objName+ " is not displayed ,please check the
			// application");

		}

	}

	/* 
	 * Name of the method: selectDropdown
	 * 
	 * Brief Description: Select the Dropdown list
	 * 
	 * Arguments: obj --> web object, objName--> name of the object
	 */

	public static void selectDropdown(WebElement obj, String objName) {

		if (obj.isDisplayed()) {

			System.out.println("Pass: " + objName + " is selected");

			obj.click();

		} else

		{

			System.out.println("Fail:" + objName + " is not present.Please chk application");

			//

		}
	}

	/*
	 * Name of the method: validateErrormsg
	 * 
	 * Brief Description: to validate the error msg
	 * 
	 * Arguments: actualmsg --> name of the object, errormsg--> name of the object
	 */

	public static void validateErrormsg(String actualmsg, String errormsg) {

		if (actualmsg.equals(errormsg))

		{

			System.out.println("TestCase is passed");

			// logger.log(LogStatus.PASS, "TestCase is passed" );

		} else

		{

			System.out.println("TestCase is failed");

			// logger.log(LogStatus.FAIL, "TestCase is failed" );

		}

	}

	/*
	 * name of the method: iFrame
	 * 
	 * BriefDescription : iframe using webelement
	 * 
	 * Arguments : driver--->driver
	 * 
	 * obj--->webelement
	 */

	public static void switchFrame(WebDriver driver, WebElement obj) {

		if (obj.isDisplayed()) {

			driver.switchTo().frame(obj);

			System.out.println("Pass: we can switch to the " + obj + " frame");

			// logger.log(LogStatus.PASS, "Switch to frame" );

		} else {

			System.out.println("fail: we can't switch to the " + obj + " frame");

			// logger.log(LogStatus.FAIL, "Cannot Switch to frame" );

		}

	}

	/*
	 * name of the method: switchFrameid
	 * 
	 * BriefDescription : iframe using webelement
	 * 
	 * Arguments : driver--->driver
	 * 
	 * obj--->iframe id
	 */

	public static void switchFrameid(WebDriver driver, String obj) {

		driver.switchTo().frame(obj);

		System.out.println("Pass: we can switch to the " + obj + " frame");

		// logger.log(LogStatus.PASS, "we can switch to the frame" );

	}

	/*
	 * name of the method: mouseOver
	 * 
	 * BriefDescription : mouseOver
	 * 
	 * Arguments : obj,index
	 */

	public static void mouseOver(WebDriver driver, WebElement obj) {

		if (obj.isDisplayed()) {

			Actions action = new Actions(driver);

			action.moveToElement(obj).build().perform();

			System.out.println("Pass: " + obj + " is present");

			// logger.log(LogStatus.PASS, "obj is present" );

		}

		else {

			System.out.println("Fail:" + obj + " is not present.Please chk application");

			// logger.log(LogStatus.FAIL, "obj is not present.Please chk application" );

		}

	}

	/*
	 * name of the method: selectbyText
	 * 
	 * BriefDescription : selected by clicking the dropdown
	 * 
	 * Arguments : obj,objName
	 
	 */

	public static void SelectbyText(WebElement we, String VisibleText) {

		if (we.isDisplayed())

		{

			Select selObj = new Select(we);

			selObj.selectByVisibleText(VisibleText);

			System.out.println("Pass: " + VisibleText + " is Selected by VisibleText");

			// logger.log(LogStatus.PASS, " is Selected by VisibleText" );

		}

		else

		{

			System.out.println("Fail: " + VisibleText + " is not available");

			// logger.log(LogStatus.FAIL, " is not Selected by VisibleText" );

		}

	}

	/*
	 * name of the method: SelectByValue
	 * 
	 * BriefDescription : selectedByValue by clicking the dropdown
	 * 
	 * Arguments : obj,index
	 */

	public static void SelectByValue(WebElement obj, String val) {

		// if(obj.isSelected()) {

		if (obj.isDisplayed()) {

			Select selObj = new Select(obj);

			selObj.selectByValue(val);

			System.out.println("pass:" + val + " is selected from drop down ");

			// logger.log(LogStatus.PASS, " is selected from drop down " );

		} else {

			System.out.println("Fail:" + val + "is not selected");

			// logger.log(LogStatus.FAIL, " is not selected from drop down " );

		}

	}
	/*
	 * name of the method: switchtoAlert
	 * 
	 * BriefDescription : Switch to alert
	 * 
	 * Arguments : driver
	 */

	public static void switchtoAlert(WebDriver driver) {

		driver.switchTo().alert().accept();

		System.out.println("Pass: alert is present and accept");

	}

}

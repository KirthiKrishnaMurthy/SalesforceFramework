package com.training.test.home;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class HomeTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	CommonUtilities common = new CommonUtilities();

	@BeforeMethod
	public void beforeTest() throws IOException {
		launchapplication();
		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
	}

	@Test(description = "TC-5:Select user menu for <username> drop down")
	public void Select_usermenu_5() throws Exception {
		String Username = common.getApplicationProperty("Uname");
		BaseTest.enterText(loginpage.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		BaseTest.enterText(loginpage.enterIntoPassword(), Password, "Passwordtext");
		BaseTest.selectCheckBox(loginpage.checkRememberme(), "RememberMe");
		BaseTest.clickObj(loginpage.LoginButton(), "Login");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		// Assert.assertEquals(expectedTitle, actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
		BaseTest.clickObj(homepage.usermenu, "usermenu");
		String dropdownverify = driver.findElement(By.xpath("//div[@id='userNav-menuItems']")).getText();
		System.out.println(dropdownverify);
	}

	@Test(description = "TC-6:Select \"My Profile\" option from user menu for <username> drop down")
	public void SelectMyProfile_TC6() throws Exception {
		String Username = common.getApplicationProperty("Uname");
		BaseTest.enterText(loginpage.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		BaseTest.enterText(loginpage.enterIntoPassword(), Password, "Passwordtext");
		BaseTest.selectCheckBox(loginpage.checkRememberme(), "RememberMe");
		BaseTest.clickObj(loginpage.LoginButton(), "Login");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		// Assert.assertEquals(expectedTitle, actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
		Thread.sleep(5000);
		BaseTest.clickObj(homepage.usermenu, "usermenu");
		Thread.sleep(5000);
		BaseTest.clickObj(homepage.myprofile, "myProfile");
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]")));
		// Edit Profile link
		Thread.sleep(5000);
		BaseTest.clickObj(homepage.Editprofile,"EditProfile");
		WebElement profileIframe = driver.findElement(By.id("contactInfoContentId"));
		switchFrame(driver, profileIframe);
		Thread.sleep(5000);
		BaseTest.clickObj(homepage.aboutTab,"aboutTab");
		homepage.lastname.clear();
		enterText(homepage.lastname, "Krishnamurthy", "lastname");
		System.out.println("LastName is Entered");
		clickObj(homepage.SaveAll, "SaveAll");
		Thread.sleep(5000);
		clickObj(homepage.post, "post");
		WebElement postIframe = driver
				.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, publisherRichTextEditor')]"));
		switchFrame(driver, postIframe);
		Thread.sleep(5000);
		clickObj(homepage.PostTextArea, "PostTextArea");
		enterText(homepage.PostTextArea, "Hello Everyone", "PostTextArea");
		driver.switchTo().defaultContent();
		clickObj(homepage.Sharebutton, "Sharebutton");
		System.out.println("Text Posted is shared");
		//Uploading a File
		Thread.sleep(5000);
		clickObj(homepage.FileLink, "FileLink");
		System.out.println("Clicked on filelink");
		clickObj(homepage.UploadFile, "UploadFile");
		System.out.println("clicked on uploadfile button on computer");
		Thread.sleep(3000);
		enterText(homepage.ChooseFile, "/Users/kirthi/Documents/Teckarch Training/draganddrop.html", "choosefile");
		System.out.println("choosefile option is selected");
		clickObj(homepage.Sharebutton, "Sharebutton");
		//Uploading photo
		Thread.sleep(3000);
		//clickObj(AddPhoto, "AddPhoto");
		mouseOver(driver, homepage.moderator);
		clickObj(homepage.AddPhotolink, "AddPhotolink");
		switchFrameid(driver, "uploadPhotoContentId");
		enterText(homepage.choosefileoption, "/Users/kirthi/Desktop/Sunflower-field-Fargo-North-Dakota.jpeg", "choosefileoption");
		clickObj(homepage.Save, "Save");
		System.out.println("TC06_MyProfile completed successfully");
	}
	

	@Test(description = "TC-7 : Select \"My settings\" option from user menu for <username> drop down")
	public void SelectMySetting() throws Exception {
		String downloadPath = "/Users/kirthi/Downloads";
		String Username = common.getApplicationProperty("Uname");
		BaseTest.enterText(loginpage.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		BaseTest.enterText(loginpage.enterIntoPassword(), Password, "Passwordtext");
		BaseTest.selectCheckBox(loginpage.checkRememberme(), "RememberMe");
		BaseTest.clickObj(loginpage.LoginButton(), "Login");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		// Assert.assertEquals(expectedTitle, actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
		BasePage.waitforElement(homepage.usermenu);
		BaseTest.clickObj(homepage.usermenu, "usermenu");
		// Click "My Settings" option from user menu
		BasePage.waitforElement(homepage.MySettings);
		BaseTest.clickObj(homepage.MySettings, "MySettings");
		// Click on personal link and select Login History link.
		BasePage.waitforElement(homepage.Personal);
		BaseTest.clickObj(homepage.Personal, "Personal");
		BasePage.waitforElement(homepage.LoginHistory);
		BaseTest.clickObj(homepage.LoginHistory, "LoginHistory");
		// downloading .csv file
		BasePage.waitforElement(homepage.LoginHistory6Months);
		BaseTest.clickObj(homepage.LoginHistory6Months, "LoginHistory6Months");
		File getLatestFile = getLatestFilefromDir(downloadPath);
		String fileName = getLatestFile.getName();
		if (isFileDownloaded_Extension(downloadPath, ".csv") == true) {
			System.out.println("file is downloded");
		} else {
			System.out.println("file is not downloded");
		}
		// Click on Display & Layout link
		BasePage.waitforElement(homepage.DisplayandLayout);
		BaseTest.clickObj(homepage.DisplayandLayout, "DisplayandLayout");
		BasePage.waitforElement(homepage.CustomizeMyTabs);
		BaseTest.clickObj(homepage.CustomizeMyTabs, "CustomizeMyTabs");
		// dropdown to select salesforce Chatter
		Select dropdownOptions = new Select(homepage.CustomAppDropdown);
		dropdownOptions.selectByVisibleText("Salesforce Chatter");
		
		// Available Tabs dropdown
		BasePage.waitforElement(homepage.AvailableTabsList);
		dropdownOptions = new Select(homepage.AvailableTabsList);
		dropdownOptions.selectByVisibleText("Reports");
		BasePage.waitforElement(homepage.AddArrow);
		BaseTest.clickObj(homepage.AddArrow, "AddArrow");
		// checking if the selected element is in Selected Tabs dropdown
		BasePage.waitforElement(homepage.SelectedTabs);
		dropdownOptions = new Select(homepage.SelectedTabs);
		List<WebElement> elements = dropdownOptions.getOptions();
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getText().equals("Reports")) {
				System.out.println("Reports Tab is added");
			} else {
				System.out.println("Reports Tab is  not added");
			}
		}
	}
	// This method is used to get the latest downloaded file from directory
		public static File getLatestFilefromDir(String dirPath) {
			File dir = new File(dirPath);
			File[] files = dir.listFiles();
			if (files == null || files.length == 0) {
				return null;
			}
			File lastModifiedFile = files[0];
			for (int i = 1; i < files.length; i++) {
				if (lastModifiedFile.lastModified() < files[i].lastModified()) {
					lastModifiedFile = files[i];
				}
			}
			return lastModifiedFile;
		}

		// This method checks the extension of the file downloaded
		public static boolean isFileDownloaded_Extension(String dirPath, String extension) {
			boolean flag = false;
			File dir = new File(dirPath);
			File[] files = dir.listFiles();
			if (files == null || files.length == 0) {
				flag = false;
			}
			for (int i = 1; i < files.length; i++) {
				if (files[i].getName().contains(extension)) {
					flag = true;
				}
			}
			return flag;
		}

		// This method is to verify if the file is downloaded or not
		public boolean isFileDownloaded(String downloadPath, String fileName) {
			boolean flag = false;
			File dir = new File(downloadPath);
			File[] dir_contents = dir.listFiles();

			for (int i = 0; i < dir_contents.length; i++) {
				if (dir_contents[i].getName().equalsIgnoreCase(fileName)) {
					return flag = true;
				}
			}
			return flag;
		}

	// Click on Email link and click on my email settings link under that
	@Test
	public void Emaillink() throws Exception {
		String Username = common.getApplicationProperty("Uname");
		BaseTest.enterText(loginpage.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		BaseTest.enterText(loginpage.enterIntoPassword(), Password, "Passwordtext");
		BaseTest.selectCheckBox(loginpage.checkRememberme(), "RememberMe");
		BaseTest.clickObj(loginpage.LoginButton(), "Login");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		// Assert.assertEquals(expectedTitle, actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
		BaseTest.clickObj(homepage.usermenu, "usermenu");
		// Click "My Settings" option from user menu
		BaseTest.clickObj(homepage.MySettings, "MySettings");
		// Email Tab
		Thread.sleep(5000);
		BaseTest.clickObj(homepage.Email, "Email");
		BaseTest.clickObj(homepage.MyEmailSettings, "MyEmailSettings");
		BaseTest.clickObj(homepage.Email_Name, "Email_Name");
		homepage.Email_Name.clear();
		homepage.Email_Name.sendKeys("Kirthi Krishnamurthy");
		homepage.Email_Address.clear();
		homepage.Email_Address.sendKeys("knugala@gmail.com");
		BaseTest.clickObj(homepage.Bcc_radioButton, "Bcc_radioButton");
		BaseTest.clickObj(homepage.Save_button, "Save_button");
	}
	
	//Calender & Remainders
	@Test
	public void CalenderAndRemainder() throws Exception {
		String Username = common.getApplicationProperty("Uname");
		BaseTest.enterText(loginpage.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		BaseTest.enterText(loginpage.enterIntoPassword(), Password, "Passwordtext");
		BaseTest.selectCheckBox(loginpage.checkRememberme(), "RememberMe");
		BaseTest.clickObj(loginpage.LoginButton(), "Login");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		// Assert.assertEquals(expectedTitle, actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
		Thread.sleep(4000);
		BaseTest.clickObj(homepage.usermenu, "usermenu");
		// Click "My Settings" option from user menu
		BaseTest.clickObj(homepage.MySettings, "MySettings");
		//Click on Calendar & Remainders
		BaseTest.clickObj(homepage.Calender_and_Reminders, "Calender_and_Reminders");
		Thread.sleep(5000);
		BaseTest.clickObj(homepage.ActivityReminders,"ActivityReminders");
		Thread.sleep(5000);
		BaseTest.clickObj(homepage.Test_Reminder,"Test_Reminder");
		Thread.sleep(5000);
		String parentWindow = driver.getWindowHandle();
		for(String handle : driver.getWindowHandles()) { 
			if(handle != parentWindow) {
				driver.switchTo().window(handle);
			String	expectedUrl1 = driver.getCurrentUrl();
			String	actualUrl1 = "https://ap8.salesforce.com/ui/core/activity/ReminderSettingsPage?setupid=Reminders&retURL=%2Fui%2Fsetup%2FSetup%3Fsetupid%3DCalendarAndReminders";
				
			if(actualUrl1.equalsIgnoreCase(expectedUrl1)) {
					System.out.println("MySettings page is not Lunched");
			}
				else {
					System.out.println("User is on MySettings page");
				}	
			}
		}
		driver.close();
		System.out.println("Tc_7_SelectMySettings is completed");
	}
	@Test(description = "TC-8: Select Developers Console option from user menu for <username> drop down")
	public void SelectDevelopersConsole()throws Exception {
		String Username = common.getApplicationProperty("Uname");
		BaseTest.enterText(loginpage.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		BaseTest.enterText(loginpage.enterIntoPassword(), Password, "Passwordtext");
		BaseTest.selectCheckBox(loginpage.checkRememberme(), "RememberMe");
		BaseTest.clickObj(loginpage.LoginButton(), "Login");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		// Assert.assertEquals(expectedTitle, actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
		Thread.sleep(4000);
		BaseTest.clickObj(homepage.usermenu, "usermenu");
		//Click on Developer Console link from the drop down
		Thread.sleep(4000);
		BaseTest.clickObj(homepage.DeveloperConsole,"DeveloperConsole");
		//Click on close button the developer console browser
		Thread.sleep(5000);
		Set<String> getAllWindows=driver.getWindowHandles();
		String[] window=getAllWindows.toArray(new String[getAllWindows.size()]);
		driver.switchTo().window(window[1]).close();
		System.out.println("TC_8_Selectdeveloperconsole completed");
	}
	@Test(description ="TC-9: Select \"Logout\" option from user menu for <username> drop down")
	public void Logout() throws Exception {
		String Username = common.getApplicationProperty("Uname");
		BaseTest.enterText(loginpage.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		BaseTest.enterText(loginpage.enterIntoPassword(), Password, "Passwordtext");
		BaseTest.selectCheckBox(loginpage.checkRememberme(), "RememberMe");
		BaseTest.clickObj(loginpage.LoginButton(), "Login");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		// Assert.assertEquals(expectedTitle, actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
		Thread.sleep(4000);
		BaseTest.clickObj(homepage.usermenu, "usermenu");
		//Click on Logout option from the drop down
		BaseTest.clickObj(homepage.Logout,"Logout");
		String	expectedUrl1 = driver.getCurrentUrl();
		String	actualUrl1 = "https://login.salesforce.com/";
			
		if(actualUrl1.equalsIgnoreCase(expectedUrl1)) {
				System.out.println("User is not in login page");
		}
			else {
				System.out.println("User is on login page");
			}
		driver.close();
		}
}


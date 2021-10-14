package com.training.page;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.training.base.BasePage;

public class HomePage extends BasePage {


	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@FindBy(xpath = "//*[@id='userNavButton']")
	public WebElement usermenu;
	
	@FindBy(xpath = "//div[@id='userNav-menuItems']")
	WebElement dropdownverify;

	@FindBy(xpath = "//a[@title='My Profile']")
	public WebElement myprofile;

	@FindBy(xpath = "//iframe[contains(@title,'Rich Text Editor, publisherRichTextEditor')]")
	public WebElement postIframe;

	@FindBy(id = "publisherAttachTextPost")
	public WebElement post;

	@FindBy(xpath = "//html[1]/body[1]")
	public WebElement PostTextArea;

	@FindBy(xpath = "//input[@id='publishersharebutton']")
	public WebElement Sharebutton;

	@FindBy(id = "name")
	public WebElement firstName;

	@FindBy(xpath = "//a[contains(@class,'contactInfoLaunch editLink')]//img")
	public WebElement Editprofile;

	@FindBy(id = "contactInfoContentId")
	public WebElement profileIframe;

	@FindBy(id = "aboutTab")
	public WebElement aboutTab;

	@FindBy(id = "lastName")
	public WebElement lastname;

	@FindBy(xpath = "//input[@value='Save All']")
	public WebElement SaveAll;

	@FindBy(xpath = "//span[contains(@class,'publisherattachtext')][contains(text(),'File')]")
	public WebElement FileLink;

	@FindBy(xpath = "//a[@title='Upload a file from your computer']")
	public WebElement UploadFile;

	@FindBy(xpath = "//input[@id='chatterFile']")
	public WebElement ChooseFile;
	
	@FindBy(id = "displayBadge")
	public WebElement moderator;
	
	@FindBy(xpath = "//a[@id='uploadLink']")
	public WebElement AddPhotolink;
	
	@FindBy(xpath = "//iframe[@id='uploadPhotoContentId']")
	public WebElement Iframe;
	
	@FindBy(id ="j_id0:uploadFileForm:uploadInputFile")
	public WebElement choosefileoption;
	
	@FindBy(id ="j_id0:uploadFileForm:uploadBtn")
	public WebElement Save;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/a[2]")
	public WebElement MySettings; 

	@FindBy(xpath ="//span[@id='PersonalInfo_font']")
	public WebElement Personal; 
	
	@FindBy(xpath ="//span[@id='LoginHistory_font']")
	public WebElement LoginHistory;
	
	@FindBy(xpath = "//div[@id='RelatedUserLoginHistoryList_body']//div//a")
	public WebElement LoginHistory6Months;
	
	@FindBy(xpath = "//span[@id='DisplayAndLayout_font']")
	public WebElement DisplayandLayout;
	
	@FindBy(xpath ="//span[@id='CustomizeTabs_font']")
	public WebElement CustomizeMyTabs;
	
	@FindBy(xpath ="//select[@id='p4']")
	public WebElement CustomAppDropdown;
	
	@FindBy(xpath ="//label[@for='duel_select_0']")
	public WebElement AvailableTabsList;
	
	@FindBy(xpath ="//select[@id='duel_select_1']")
	public WebElement SelectedTabs;
	
	@FindBy(xpath ="//img[@title='Add']")
	public WebElement AddArrow;
	
	@FindBy(id ="EmailSetup_font")
	public WebElement Email;
	
	@FindBy(id ="EmailSettings_font")
	public WebElement MyEmailSettings;
	
	@FindBy(xpath ="//input[@id='sender_name']")
	public WebElement Email_Name;
	
	@FindBy(xpath ="//input[@id='sender_email']")
	public WebElement Email_Address;
	
	@FindBy(xpath ="//input[@id='auto_bcc1']")
	public WebElement Bcc_radioButton;
	
	@FindBy(name ="save")
	public WebElement Save_button;
	
	@FindBy(id = "CalendarAndReminders") 
	public WebElement Calender_and_Reminders;
	
	@FindBy(xpath = "//span[@id='Reminders_font']")
	public WebElement ActivityReminders;
	
	@FindBy(xpath = "//input[@id='testbtn']")
	public WebElement Test_Reminder;
	
	@FindBy(xpath = "//a[@title='Developer Console (New Window)']")
	public WebElement DeveloperConsole;
			
	@FindBy(xpath = "//a[@title='Switch to Lightning Experience']")
	public WebElement SwitchtoLightningExperience;
	
	@FindBy(xpath = "//a[@title='Logout']")
	public WebElement Logout;
	
	public void enterIntoFirstName(String strFirstName) {
		waitforElement(firstName);
		firstName.sendKeys(strFirstName);
	}

	public void MyProfile() {
		waitforElement(myprofile);
		myprofile.click();
	}

	public void SwitchToPost() {
		waitforElement(post);
		post.click();
		waitforElement(postIframe);
		PostTextArea.click();
		PostTextArea.sendKeys("Hello Everyone");
		driver.switchTo().defaultContent();
		waitforElement(Sharebutton);
		Sharebutton.click();
	}

	// Edit Profile link
	public void EditProfileLink() {
		waitforElement(Editprofile);
		if (Editprofile.isDisplayed() && Editprofile.isEnabled())
			Editprofile.click();
		driver.switchTo().frame(profileIframe);
		waitforElement(aboutTab);
		aboutTab.click();
		lastname.clear();
		lastname.sendKeys("KrishnaMurthy");
		System.out.println("LastName is Entered");
		waitforElement(SaveAll);
		SaveAll.click();
	}

	/* Uploading a File */
	public void UploadFile() {
		waitforElement(FileLink);
		FileLink.click();
		System.out.println("Clicked on filelink");
		waitforElement(UploadFile);
		UploadFile.click();
		System.out.println("clicked on uploadfile button on computer");
		waitforElement(ChooseFile);
		ChooseFile.sendKeys("/Users/kirthi/Documents/Teckarch Training/draganddrop.html");
		System.out.println("choosefile option is selected");
		Sharebutton.submit();
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
}

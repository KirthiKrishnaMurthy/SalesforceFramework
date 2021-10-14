package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class RandomScenariosPage extends BasePage {

	public RandomScenariosPage(WebDriver driver) {
		super(driver);
	}
	//Elements for TC-33
	@FindBy(xpath="//li[@id='home_Tab']//a[contains(text(),'Home')]")
	public WebElement Home;
	
	@FindBy(xpath = "//a[@id='tryLexDialogX']")
	public WebElement ClosePrompt;
	
	
	@FindBy(xpath ="//div[@id='ptBody']//div//div//span//h1//a")
	public WebElement NameLink;
	
	//Element For TC-34
	
	@FindBy(xpath ="//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")
	public WebElement Edit;
	
	@FindBy(xpath ="//li[@id='aboutTab']")
	public WebElement AboutTab;
	
	@FindBy(className="lastName")
	public WebElement lastName;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")
	public WebElement SaveAll;
	
	//Elements For TC-35
	
	@FindBy(id="AllTab_Tab")
	public WebElement AllTab_Tab;
	
	@FindBy(xpath="//input[contains(@title,'Customize My Tabs')]")
	public WebElement CustomizeMyTabs;
	
	@FindBy(xpath="//option[@value='Chatter']")
	public WebElement Chatter;
	
	@FindBy(className="leftArrowIcon")
	public WebElement leftarrow;
	
	@FindBy(xpath="//input[@title='Save']")
	public WebElement save;
	
	@FindBy(xpath="//div[@id='userNav']")
	public WebElement UserMenu;
	
	@FindBy(xpath="//a[@title='Logout']")
	public WebElement logout;
	
	@FindBy(xpath="//input[@id='username']")
	public WebElement Uname1;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement pwd1;
	
	@FindBy(xpath="//*[@id='Login']")
	public WebElement login1;
	
	//Elements For TC-36
	
	@FindBy(xpath="//tbody/tr/td[@id='bodyCell']/div/div[@id='ptBody']/div/div/span/a[1]")
	public WebElement datelink;
	
	@FindBy(xpath ="//a[normalize-space()='8:00 PM']")
	public WebElement Time;
	
	@FindBy(xpath = "//img[@title='Subject Combo (New Window)']")
	public WebElement SubjectCombo;
	
	@FindBy(xpath="//li[5]//a[1]")
	public WebElement Other;
	
	@FindBy(xpath="//input[@id='EndDateTime_time']")
	public WebElement EndTime;
	
	@FindBy(xpath="//input[@id='EndDateTime']")
	public WebElement EndDate;
	
	@FindBy(xpath="//img[contains(@class,'calRight')]")
	public WebElement DateArrow;
	
	@FindBy(xpath="//td[normalize-space()='10']")
	public WebElement pickingdate;
	
	@FindBy(xpath="//div[@id='timePickerItem_42']")
	public WebElement TimePicker;
	
	@FindBy(className ="btn")
	public WebElement Save;
	
	//Elements For TC-37
	
	@FindBy(linkText="4:00 PM")
	public WebElement time;
	
	@FindBy(xpath="//div[@id='timePickerItem_38']")
	public WebElement timePicker;
	
	@FindBy(xpath = "//input[@id='IsRecurrence']")
	public WebElement recurr;
	
	@FindBy(xpath ="//label[normalize-space()='Weekly']")
	public WebElement frequency;
	
	@FindBy(xpath="//input[@id='recdd1']")
	public WebElement RecurseEvery;
	
	@FindBy(xpath = "//input[@id='RecurrenceEndDateOnly']")
	public WebElement recendtime;
	
	
	

}

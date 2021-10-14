package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class LeadsPage extends BasePage{

	public LeadsPage(WebDriver driver) {
		super(driver);
		}
	
	//Elements For TC-20
	
	@FindBy(xpath = "//a[@title='Leads Tab']")
	public WebElement Leads;
	
	//Elements For TC-21
	
	@FindBy(xpath = "//a[@id='tryLexDialogX']")
	public WebElement ClosePrompt;
	
	@FindBy(xpath = "//select[@id='fcf']")
	public WebElement LeadView;
	
	//Elements For TC-22
	
	@FindBy(xpath = "//*[@id='userNavButton']")
	public WebElement usermenu;
	
	@FindBy(xpath = "//a[@title='Logout']")
	public WebElement Logout;
	
	@FindBy(xpath ="//input[@id='username']")
	public WebElement Uname1;
	
	@FindBy(xpath ="//input[@id='password']")
	public WebElement pwd1;
	
	@FindBy(xpath ="//*[@id='Login']")
	public WebElement login1;
	
	@FindBy(id ="Lead_Tab")
	public WebElement Leadslink;
	
	//Elements For TC-23
	
	@FindBy(xpath ="//span[@class='fBody']//input[@name='go']")
	public WebElement gobutton;
	
	//Elements For TC-24
	
	@FindBy(xpath = "//select[@id='fcf']")
	public WebElement LeadSelect;
	
	@FindBy(xpath = "//input[@title='New']")
	public WebElement New;
	
	@FindBy(xpath = "//select[@id='lea13']")
	public WebElement LeadStatus;
	
	@FindBy(xpath ="//input[@id='name_lastlea2']")
	public WebElement LastName;
	
	@FindBy(xpath ="//input[@id='lea3']")
	public WebElement Company;
	
	@FindBy(xpath ="//td[@id='bottomButtonRow']//input[@title='Save']")
	public WebElement SaveButton;
	
	
	
	

}

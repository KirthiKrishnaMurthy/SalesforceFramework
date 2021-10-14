package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class OpportunityPage extends BasePage {
	public OpportunityPage(WebDriver driver) {
		super(driver);
	}

	// Elements for TC-15

	@FindBy(xpath = "//a[@title='Opportunities Tab']")
	public WebElement OpportunitiesTab;
	
	@FindBy(xpath = "//a[@id='tryLexDialogX']")
	public WebElement ClosePrompt;
	

	@FindBy(xpath = "//select[@id='fcf']")
	public WebElement dropdown;
	
	//Elements for TC-16
	
	@FindBy(xpath = "//input[@title='New']")
	public WebElement Newbutton ;
	
	@FindBy(xpath = "//input[@id='opp3']")
	public WebElement OpportunityName;
	
	@FindBy(xpath = "//input[@id='opp4']")
	public WebElement AccountName;
	
	@FindBy(xpath = "//img[@title='Account Name Lookup (New Window)']")
	public WebElement AccNLookupWindow ;
	
	@FindBy(xpath = "//input[@name='go']")
	public WebElement GoButton ;
	
	@FindBy(xpath = "//a[normalize-space()='Today']")
	public WebElement Today;
	
	@FindBy(xpath = "//select[@id='opp11']")
	public WebElement Stage;
	
	@FindBy(xpath = "//input[@id='opp12']")
	public WebElement Probablity ;
	
	@FindBy(xpath = "//select[@id='opp6']")
	public WebElement LeadSource ;
	
	@FindBy(xpath = "//input[@id='opp17']")
	public WebElement PrimaryCampaignSource;
	
	//Elements for TC-17
	
	@FindBy(xpath = "//a[contains(text(),'Opportunity Pipeline')]")
	public WebElement OpportunityPipeline;
	
	//Elements for TC-18
	
	@FindBy(xpath = "//a[contains(text(),'Stuck Opportunities')]")
	public WebElement StuckOpp ;
	
	//Elements for TC-19
	@FindBy(xpath = "//select[@id='quarter_q']")
	public WebElement Interval;
	
	@FindBy(xpath = "//select[@id='open']")
	public WebElement include;
	
	@FindBy(xpath = "//input[@title='Run Report']")
	public WebElement RunReport;
	
	
	
	
	
}


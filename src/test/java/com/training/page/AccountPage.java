package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class AccountPage extends BasePage{
	public AccountPage(WebDriver driver) {
		super(driver);
		
	}
	//Element For TC-10
	
	@FindBy(xpath = "//a[@title='Accounts Tab']")
	public WebElement Accounts_Tab;
	
	@FindBy(xpath = "//a[@id='tryLexDialogX']")
	public WebElement ClosePrompt;
	
	@FindBy(xpath ="//div[@id='createNewButton']")
	public WebElement CreateNewButton;
	
	@FindBy(xpath  ="//td[@id='sidebarCell']//a[3]")
	public WebElement Account;
	
	@FindBy(id= "acc2")
	public WebElement AccountName;
	
	@FindBy(xpath = "//select[@id='acc6']")
	public WebElement selecttype;
	
	@FindBy(xpath="//select[@id='00N5f000006eiJw']")
	public WebElement  coustomerpriority;

	@FindBy(name = "save")
	public WebElement Save;
	
	//Elements For TC-11
	
	@FindBy(xpath ="//a[normalize-space()='Create New View']")
	public WebElement CreateNewView;
	
	@FindBy(xpath ="//input[@id='fname']")
	public WebElement ViewName;
	
	@FindBy(xpath ="//input[@id='devname']")
	public WebElement ViewUniqueName;
	
	@FindBy(className = "title")
	public WebElement dropdown;

	//Elements For TC-12
	
	@FindBy(xpath ="//select[@id='fcf']")
	public WebElement View;
	
	@FindBy(xpath ="//a[normalize-space()='Edit']")
	public WebElement EditLink;
	
	@FindBy(xpath ="//select[@id='fcol1']")
	public WebElement FirstField;
	
	@FindBy(xpath ="//select[@id='fop1']")
	public WebElement Operator;
	
	@FindBy(xpath ="//input[@id='fval1']")
	public WebElement Value;
	
	@FindBy(xpath="//select[@id='colselector_select_0']")
	public WebElement Available_Fields_dropdown;
	
	//Elements For TC-13
	
	@FindBy(xpath ="//a[normalize-space()='Merge Accounts']")
	public WebElement MergeAccounts;
	
	@FindBy(xpath = "//input[@id='srch']")
	public WebElement FindAccountsSearch;
	
	@FindBy(xpath = "//input[@name='srchbutton']")
	public WebElement FindAccountsButton;
	
	@FindBy(xpath="//input[@id='cid0']")
	public WebElement Button1;
	
	@FindBy(xpath ="//input[@id='cid1']")
	public WebElement Button2;
	
	@FindBy(xpath="/input[@id='cid2']")
	public WebElement Button3;
	
	@FindBy(xpath="//div[contains(@class,'pbTopButtons')]//input[contains(@title,'Next')]")
	public WebElement Next;
	
	@FindBy(xpath="//div[@class='pbTopButtons']//input[@title='Merge']")
	public WebElement Merge;
	
	//Elements For TC-14
	
	@FindBy(xpath="//a[normalize-space()='Accounts with last activity > 30 days']")
	public WebElement AccountsLastActivity;
	
	@FindBy(xpath="//img[@id='ext-gen148']")
	public WebElement DateDropDown;
	
	@FindBy(xpath="//div[contains(text(),'Created Date')]")
	public WebElement CreatedDate;
	
	@FindBy(name ="startDate")
	public WebElement StartDate;
	
	@FindBy(name ="endDate")
	public WebElement EndDate;
	
	@FindBy(xpath="//button[@id='ext-gen49']")
	public WebElement save;
	
	@FindBy(name ="reportName")
	public WebElement ReportNames;
	
	@FindBy(id ="saveReportDlg_DeveloperName")
	public WebElement ReportUniName;
	
	@FindBy(xpath="//table[@id='dlgSaveAndRun']")
	public WebElement SaveAndRun;
	
	
	
	
	
	
}
	

	
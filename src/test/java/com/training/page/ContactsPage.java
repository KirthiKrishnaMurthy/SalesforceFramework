package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class ContactsPage extends BasePage{
public ContactsPage(WebDriver driver) {
		super(driver);
	}

//Elements For TC-25

@FindBy(xpath = "//a[@title='Contacts Tab']")
public WebElement contact;

@FindBy(xpath = "//a[@id='tryLexDialogX']")
public WebElement ClosePrompt;


@FindBy(xpath = "//input[contains(@title,'New')]")
public WebElement new_Element;

@FindBy(xpath = "//input[@id='name_firstcon2']")
public WebElement first_name ;

@FindBy(xpath = "//input[@id='name_lastcon2']")
public WebElement last_name;

@FindBy(xpath = "//input[@id='con4']")
public WebElement account_name;

@FindBy(className = "btn")
public WebElement save;

//Elements For TC-26
@FindBy(xpath = "//a[contains(text(),'Create New View')]")
public WebElement Contactnewview;

@FindBy(xpath = "//input[@id='fname']")
public WebElement  ViewNames;

@FindBy(xpath = "//input[@id='devname']")
public WebElement View_UniqueName;

@FindBy(xpath = "//td[@id='topButtonRow']//input[@title='Save']")// Not Working So used ClassName
public WebElement Save;

//Elements For TC-27

@FindBy(xpath ="//select[@id='hotlist_mode']")
public WebElement Rec_Created;

//Elements For TC-28

@FindBy(xpath ="//select[@id='fcf']")
public WebElement Mycont_view ;

@FindBy(xpath ="//input[@title='Go!']")
public WebElement GoButton;

//Elements For TC-29

//@FindBy(xpath="//a[contains(text(),'tek1')]")
//public WebElement Contactname;

@FindBy(xpath="//th[contains(@scope,'row')]//a")
public WebElement Contactname;

//Elements For TC-31

@FindBy(name ="fname")
public WebElement name;

@FindBy(xpath="//div[@class='pbBottomButtons']//input[@title='Cancel']")
public WebElement cancel;

//Elements For TC-32

@FindBy(xpath="//td[@id='bottomButtonRow']//input[@title='Save & New']")
public WebElement SaveandNew;


}

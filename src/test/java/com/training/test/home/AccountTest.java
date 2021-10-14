package com.training.test.home;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.page.AccountPage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class AccountTest extends BaseTest {
	LoginPage loginpage;
	AccountPage accountpage;
	CommonUtilities common = new CommonUtilities();

	@BeforeMethod
	public void beforeTest() throws IOException {
		launchapplication();
		loginpage = new LoginPage(driver);
		accountpage = new AccountPage(driver);
	}

	@Test(description = "TC-10: CreateAccount")
	public void CreateAnAccount() throws Exception {
		String Username = common.getApplicationProperty("Uname");
		enterText(loginpage.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		enterText(loginpage.enterIntoPassword(), Password, "Passwordtext");
		selectCheckBox(loginpage.checkRememberme(), "RememberMe");
		clickObj(loginpage.LoginButton(), "Login");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		// Assert.assertEquals(expectedTitle, actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
		// Opening Accounts page
		accountpage.Accounts_Tab.click();
		System.out.println("Clicked on Accounts Tab");
		BasePage.waitforElement(accountpage.ClosePrompt);
		accountpage.ClosePrompt.click();
		// Creating New Account
		BasePage.waitforElement(accountpage.CreateNewButton);
		accountpage.CreateNewButton.click();
		System.out.println("Clicked on New tab");
		BasePage.waitforElement(accountpage.Account);
		accountpage.Account.click();
		System.out.println("Clicked on Account");
		BasePage.waitforElement(accountpage.AccountName);
		accountpage.AccountName.clear();
		accountpage.AccountName.sendKeys("Accounts");
		Select select = new Select(accountpage.selecttype);
		select.selectByVisibleText("Technology Partner");
		BasePage.waitforElement(accountpage.coustomerpriority);
		Select select1 = new Select(accountpage.coustomerpriority);
		select1.selectByVisibleText("High");
		accountpage.Save.click();
		System.out.println("Clicked on Save button");
		System.out.println("Tc_10_create account is completed");
		driver.close();
	}

	@Test(description="TC11 Createnewview")
	public void Createnewview() throws Exception {
		String Username = common.getApplicationProperty("Uname");
		enterText(loginpage.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		enterText(loginpage.enterIntoPassword(), Password, "Passwordtext");
		selectCheckBox(loginpage.checkRememberme(), "RememberMe");
		clickObj(loginpage.LoginButton(), "Login");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		// Assert.assertEquals(expectedTitle, actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
		// Opening Accounts page
		accountpage.Accounts_Tab.click();
		System.out.println("Clicked on Accounts Tab");
		BasePage.waitforElement(accountpage.ClosePrompt);
		accountpage.ClosePrompt.click();
		//Creating New View
		accountpage.CreateNewView.click();
		System.out.println("Clicked on Create New View..");
		BasePage.waitforElement(accountpage.ViewName);
		accountpage.ViewName.clear();
		accountpage.ViewName.sendKeys("Test");
		String value = accountpage.ViewName.getAttribute("value");
		System.out.println(value);
		BasePage.waitforElement(accountpage.ViewUniqueName);
		accountpage.ViewUniqueName.clear();
		accountpage.ViewUniqueName.sendKeys("ing");
		accountpage.Save.click();
		System.out.println("Clicked on save button"); 
		/*accountpage.dropdown.click();
		Select dropdown_options = new Select(accountpage.dropdown);
		List<WebElement> options = dropdown_options.getOptions();
		
		for(int i=0; i<options.size(); i++) {
			if(options.get(i).getText().equals(value)) {
				System.out.println("Account name is displayed in the dropdown");
			}
		} */
		System.out.println("TC_11_Createnewview is completed");
		driver.close();
	}
	
	@Test(description = "TC12 Editview")
	public void EditView() throws Exception {
		String Username = common.getApplicationProperty("Uname");
		enterText(loginpage.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		enterText(loginpage.enterIntoPassword(), Password, "Passwordtext");
		selectCheckBox(loginpage.checkRememberme(), "RememberMe");
		clickObj(loginpage.LoginButton(), "Login");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		// Assert.assertEquals(expectedTitle, actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
		// Opening Accounts page
		accountpage.Accounts_Tab.click();
		System.out.println("Clicked on Accounts Tab");
		BasePage.waitforElement(accountpage.ClosePrompt);
		accountpage.ClosePrompt.click();
		clickObj(accountpage.EditLink, "EditLink");
		accountpage.ViewName.clear();
		WebElement s3 =driver.findElement(By.id("fname"));
		s3.clear();
		enterText(s3, "viewname", "ViewName");
		System.out.println("Viewname entered in the field");
		clickObj(accountpage.FirstField, "firstcolumn");
		Select accfield = new Select(accountpage.FirstField);
		accfield.selectByIndex(1);
		Select operator = new Select(accountpage.Operator);
		operator.selectByIndex(3);
		accountpage.Value.clear();
		accountpage.Value.sendKeys("<a>");
		/*These statements verifies if the "Last Activity" is availble in the Available Fields
		 * If Last Activity is available under Available Fields, It add the same to Selected Fields
		 * and save the modifications
//		 */
//		Select Available_Fields_dropdown_list = new Select(accountpage.Available_Fields_dropdown);
//		List<WebElement> Available_Fields_dropdown_options = Available_Fields_dropdown_list.getOptions();
//		boolean Element_available = false; //using as a reference to validate if the last activity is in available fields dropdown or not
//		
//		for(int i=0; i<Available_Fields_dropdown_options.size(); i++) {
//			if(Available_Fields_dropdown_options.get(i).getText().equals("Last Activity")) {
//				Element_available = true;
//				WebElement Add_arrow = driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
//				Add_arrow.click();
//				break;
//			}
//		}
//	/*These statements verifies if the "Last Activity" is availble in the Selected Fields
//	 * If Last Activity is available under Selected Fields, save the modifications
//	 * 		 */
//	if(Element_available = false) {
//		WebElement Selected_Fields_dropdown = driver.findElement(By.xpath("//select[@id='colselector_select_1']"));
//		Select Selected_Fields_dropdown_list = new Select(accountpage.Available_Fields_dropdown);
//		List<WebElement> Selected_Fields_dropdown_options = accountpage.Available_Fields_dropdown.getSize();
//
//		for(int i=0; i<Available_Fields_dropdown.Size(); i++) {
//			if(Selected_Fields_dropdown_options.get(i).getText().equals("Last Activity")) {
//				break;
//			}
//		}	
//	}
//	
	}
	
	@Test(description = "TC13 MergeAccounts")
	public void MergeAccounts() throws Exception {
		String Username = common.getApplicationProperty("Uname");
		enterText(loginpage.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		enterText(loginpage.enterIntoPassword(), Password, "Passwordtext");
		selectCheckBox(loginpage.checkRememberme(), "RememberMe");
		clickObj(loginpage.LoginButton(), "Login");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		// Assert.assertEquals(expectedTitle, actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
		// Opening Accounts page
		accountpage.Accounts_Tab.click();
		System.out.println("Clicked on Accounts Tab");
		BasePage.waitforElement(accountpage.ClosePrompt);
		accountpage.ClosePrompt.click();
		//Select accounts to merge
		BasePage.waitforElement(accountpage.MergeAccounts);
		clickObj(accountpage.MergeAccounts, "MergeAccount");
		accountpage.FindAccountsSearch.clear();
		BasePage.waitforElement(accountpage.FindAccountsSearch);
		enterText(accountpage.FindAccountsSearch, "liid", "FindAccountsSearch");
		BasePage.waitforElement(accountpage.FindAccountsButton);
		clickObj(accountpage.FindAccountsButton, "FindAccountsButton");
	    Radiobutton(accountpage.Button1, "RadioButton");
	    Radiobutton(accountpage.Button2, "RadioButton");
	    //Radiobutton(accountpage.Button3, "RadioButton");
	    accountpage.Next.click();   
	    //Merge accounts
	    accountpage.Merge.click();	    
	    switchtoAlert(driver);	
	    driver.close();
	    System.out.println("TC13_MergeAccounts is completed");
	   }
	
	@Test(description = "TC14 Create account report")
	public void CreateAccountReport() throws Exception {
		String Username = common.getApplicationProperty("Uname");
		enterText(loginpage.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		enterText(loginpage.enterIntoPassword(), Password, "Passwordtext");
		selectCheckBox(loginpage.checkRememberme(), "RememberMe");
		clickObj(loginpage.LoginButton(), "Login");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		// Assert.assertEquals(expectedTitle, actualTitle);
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
		// Opening Accounts page
		accountpage.Accounts_Tab.click();
		System.out.println("Clicked on Accounts Tab");
		BasePage.waitforElement(accountpage.ClosePrompt);
		accountpage.ClosePrompt.click();
		//Create account report
		BasePage.waitforElement(accountpage.AccountsLastActivity);
		clickObj(accountpage.AccountsLastActivity,"AccountsLastActivity");
		//Select report options
		BasePage.waitforElement(accountpage.DateDropDown);
		clickObj(accountpage.DateDropDown,"DateDropDown");
		BasePage.waitforElement(accountpage.CreatedDate);
		clickObj(accountpage.CreatedDate, "CreatedDate");
		accountpage.StartDate.clear();
		enterText(accountpage.StartDate, "01/04/2019","calenderdata");
		accountpage.EndDate.clear();
		enterText(accountpage.EndDate, "03/04/2019", "calenderdata");
		accountpage.save.click();
		accountpage.ReportNames.clear();
		Thread.sleep(10000);
		enterText(accountpage.ReportNames, "Reports", "ChangeReportName");
		accountpage.ReportUniName.clear();
		Thread.sleep(10000);
		enterText(accountpage.ReportUniName, "WelsFargo3", "ChangeReportUniqueName");
		BasePage.waitforElement(accountpage.SaveAndRun);
		clickObj(accountpage.SaveAndRun, "SaveAndRun");
		//driver.close();
		System.out.println("TC_14_Createaccountreport is completed");
		}
}
	


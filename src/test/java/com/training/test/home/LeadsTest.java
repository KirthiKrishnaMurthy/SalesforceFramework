package com.training.test.home;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.page.LeadsPage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class LeadsTest extends BaseTest{
	LoginPage loginpage;
	LeadsPage leadspage;
	CommonUtilities common = new CommonUtilities();

	@BeforeMethod
	public void beforeTest() throws IOException {
		launchapplication();
		loginpage = new LoginPage(driver);
		leadspage = new LeadsPage(driver);
	}
	@Test(description ="TC20-leadsTab")
	public void leadsTab() throws Exception {
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
			BasePage.waitforElement(leadspage.Leads);
			clickObj(leadspage.Leads, "Leads");
			driver.close();
			System.out.println("TC20_LeadsTab is completed");	
	}
	@Test(description = "TC_21_leadsSelectView")
	public void leadsSelectView() throws Exception{
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
		BasePage.waitforElement(leadspage.Leads);
		clickObj(leadspage.Leads, "Leads");
		BasePage.waitforElement(leadspage.ClosePrompt);
		leadspage.ClosePrompt.click();
		clickObj(leadspage.LeadView, "LeadView"); 
		Select view = new Select(leadspage.LeadView);
		 //Get all options
	    List<WebElement> vew = view.getOptions();

	    //Get the length
	    System.out.println(vew.size());

	    // Loop to print one by one
	    for (int j = 0; j < vew.size(); j++) {
	        System.out.println(vew.get(j).getText());

	    }
	    driver.close();
		System.out.println("TC21_LeadsSelectView is completed");
		}
	@Test(description = "TC_22_defaultView")
	public void defaultView() throws Exception {
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
		BasePage.waitforElement(leadspage.Leads);
		clickObj(leadspage.Leads, "Leads");
		BasePage.waitforElement(leadspage.ClosePrompt);
		leadspage.ClosePrompt.click();
		BasePage.waitforElement(leadspage.LeadView);
		clickObj(leadspage.LeadView, "LeadView"); 
		Select view = new Select(leadspage.LeadView);
		view.selectByIndex(3);
		Thread.sleep(3000);
		selectDropdown(leadspage.usermenu, "UserMenu");
		BasePage.waitforElement(leadspage.Logout);
		clickObj(leadspage.Logout, "logout");
		BasePage.waitforElement(leadspage.Uname1);
		enterText(leadspage.Uname1, "kirthi08@tekarch.com", "UserName");
		leadspage.pwd1.clear();
		enterText(leadspage.pwd1, "Shanu@123", "Password");
		clickObj(leadspage.login1, "login");
		BasePage.waitforElement(leadspage.Leadslink);
		clickObj(leadspage.Leadslink, "Leadslink");
		 driver.close();
			System.out.println("TC_22_defaultView is completed");
			}
	@Test(description = "TC23_TodaysLeads")
	public void TodaysLeads() throws Exception {
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
		BasePage.waitforElement(leadspage.Leads);
		clickObj(leadspage.Leads, "Leads");
		BasePage.waitforElement(leadspage.ClosePrompt);
		leadspage.ClosePrompt.click();
		BasePage.waitforElement(leadspage.LeadView);
		clickObj(leadspage.LeadView, "LeadView"); 
		Select view = new Select(leadspage.LeadView);
		view.selectByIndex(3);
		Thread.sleep(3000);
		leadspage.gobutton.click();
		driver.close();
		System.out.println("TC_23_TodaysLeads is completed");
	}
	@Test(description = "TC_24_CheckNewbutton")
	public void CheckNewbutton() throws Exception {
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
		BasePage.waitforElement(leadspage.Leads);
		clickObj(leadspage.Leads, "Leads");
		BasePage.waitforElement(leadspage.ClosePrompt);
		leadspage.ClosePrompt.click();
		clickObj(leadspage.LeadSelect, "LeadSelect");
		BasePage.waitforElement(leadspage.New);
		clickObj(leadspage.New, "New");
		BasePage.waitforElement(leadspage.LeadStatus);
		clickObj(leadspage.LeadStatus, "LeadStatus");
		SelectByValue(leadspage.LeadStatus, "Open - Not Contacted");
		BasePage.waitforElement(leadspage.LastName);
		enterText(leadspage.LastName, "KrishnaMurthy", "LastName");
		enterText(leadspage.Company, "welsfargo", "companyname");
		clickObj(leadspage.SaveButton, "SaveButton");
		driver.close();
		System.out.println(" TC24_NewLeads is completed");
		
	}
}




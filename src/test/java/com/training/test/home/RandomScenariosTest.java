package com.training.test.home;

import java.io.IOException;
import java.util.Set;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BasePage;
import com.training.base.BaseTest;

import com.training.page.LoginPage;
import com.training.page.RandomScenariosPage;
import com.training.utilities.CommonUtilities;

public class RandomScenariosTest extends BaseTest  {
	LoginPage loginpage;
	RandomScenariosPage randomscenariospage;
	CommonUtilities common = new CommonUtilities();

	@BeforeMethod
	public void beforeTest() throws IOException {
		launchapplication();
		loginpage = new LoginPage(driver);
		randomscenariospage = new RandomScenariosPage(driver);
	}
	@Test(description ="TC_33")
	public void TC_33() throws Exception{
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
		//Click Home Tab
		clickObj(randomscenariospage.Home, "Home");
		BasePage.waitforElement(randomscenariospage.ClosePrompt);
		randomscenariospage.ClosePrompt.click();
		Thread.sleep(3000);
		//Click on the FirstName LastName link in the home page
		clickObj(randomscenariospage.NameLink, "NameLink");
		driver.close();
		System.out.println("TC33_VerifyName is Completed");
		}
	@Test(description ="TC_34")
	public void TC_34() throws Exception{
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
		//Click Home Tab
		clickObj(randomscenariospage.Home, "Home");
		BasePage.waitforElement(randomscenariospage.ClosePrompt);
		randomscenariospage.ClosePrompt.click();
		Thread.sleep(3000);
		//Click on the FirstName LastName link in the home page
		clickObj(randomscenariospage.NameLink, "NameLink");
		String homepage = driver.getWindowHandle();
		 System.out.println("homepage is displayed");
		 clickObj(randomscenariospage.Edit, "Edit");
		 Thread.sleep(3000);
		driver.switchTo().frame("contactInfoContentId");
		randomscenariospage.AboutTab.click();
		randomscenariospage.lastName.clear();
		randomscenariospage.lastName.sendKeys("KrishnaMurthy");
		randomscenariospage.SaveAll.click();
		driver.close();
		System.out.println("TC34_EditedLastName Executed sucessfully");
		}
	@Test(description ="TC_35")
	public void TC_35() throws Exception{
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
		clickObj(randomscenariospage.AllTab_Tab, "AllTabs");
		BasePage.waitforElement(randomscenariospage.CustomizeMyTabs);
		clickObj(randomscenariospage.CustomizeMyTabs, "Customizetab");
		BasePage.waitforElement(randomscenariospage.Chatter);
		clickObj(randomscenariospage.Chatter, "Chatter");
		BasePage.waitforElement(randomscenariospage.leftarrow);
		clickObj(randomscenariospage.leftarrow, "leftarrow");
		BasePage.waitforElement(randomscenariospage.save);
		clickObj(randomscenariospage.save, "save");
		BasePage.waitforElement(randomscenariospage.UserMenu);
		selectDropdown(randomscenariospage.UserMenu, "UserMenu");
		BasePage.waitforElement(randomscenariospage.logout);
		clickObj(randomscenariospage.logout, "logout");
		Thread.sleep(3000);
		enterText(randomscenariospage.Uname1, "kirthi08@tekarch.com", "UserName");
		randomscenariospage.pwd1.clear();
		enterText(randomscenariospage.pwd1, "Shanu@123", "Password");
		clickObj(randomscenariospage.login1, "login");
		   driver.close();
			System.out.println("TC35_CustomTab Executed sucessfully");
	    }
	@Test(description ="TC_36_Blockingeventcalender")
	public void Blockingeventcalender() throws Exception{
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
		//Click Home Tab
		clickObj(randomscenariospage.Home, "Home");
		BasePage.waitforElement(randomscenariospage.ClosePrompt);
		randomscenariospage.ClosePrompt.click();
		BasePage.waitforElement(randomscenariospage.datelink);
		clickObj(randomscenariospage.datelink, "datelink");
		BasePage.waitforElement(randomscenariospage.Time);
		clickObj(randomscenariospage.Time, "Time");
		BasePage.waitforElement(randomscenariospage.SubjectCombo);
		randomscenariospage.SubjectCombo.click();
		Set<String> windowHandles = driver.getWindowHandles();
		String currentHandle = driver.getWindowHandle();
		windowHandles.remove(currentHandle);
		String newHandle = windowHandles.iterator().next();
		driver.switchTo().window(newHandle);
		randomscenariospage.Other.click();
		driver.switchTo().window(currentHandle);
		Thread.sleep(2000);
		randomscenariospage.EndDate.sendKeys("7/5/2020");
		randomscenariospage.DateArrow.click();
		randomscenariospage.pickingdate.click();
		BasePage.waitforElement(randomscenariospage.EndTime);
		clickObj(randomscenariospage.EndTime,"endtime");
		BasePage.waitforElement(randomscenariospage.TimePicker);
		randomscenariospage.TimePicker.click();
		BasePage.waitforElement(randomscenariospage.Save);
		randomscenariospage.Save.click();
		driver.close();
		System.out.println("TC36_EventinCalender Executed sucessfully");
		}
	@Test(description ="TC_37_Blockingcalenderweeklyrecurrance")
	public void Blockingcalenderweeklyrecurrance() throws Exception{
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
		//Click Home Tab
		clickObj(randomscenariospage.Home, "Home");
		BasePage.waitforElement(randomscenariospage.ClosePrompt);
		randomscenariospage.ClosePrompt.click();
		BasePage.waitforElement(randomscenariospage.datelink);
		clickObj(randomscenariospage.datelink, "datelink");
		BasePage.waitforElement(randomscenariospage.time);
		clickObj(randomscenariospage.time,"time");
		BasePage.waitforElement(randomscenariospage.SubjectCombo);
		randomscenariospage.SubjectCombo.click();
		Set<String> windowHandles = driver.getWindowHandles();
		String currentHandle = driver.getWindowHandle();
		windowHandles.remove(currentHandle);
		String newHandle = windowHandles.iterator().next();
		driver.switchTo().window(newHandle);
		randomscenariospage.Other.click();
		driver.switchTo().window(currentHandle);
		Thread.sleep(2000);
		randomscenariospage.EndDate.sendKeys("7/5/2020");
		randomscenariospage.DateArrow.click();
		randomscenariospage.pickingdate.click();
		BasePage.waitforElement(randomscenariospage.EndTime);
		clickObj(randomscenariospage.EndTime,"endtime");
		BasePage.waitforElement(randomscenariospage.timePicker);
		randomscenariospage.timePicker.click();
		BasePage.waitforElement(randomscenariospage.recurr);
		clickObj(randomscenariospage.recurr,"recurrence");
		Thread.sleep(5000);
		clickObj(randomscenariospage.frequency, "reccurencetype");
		//BasePage.waitforElement(randomscenariospage.RecurseEvery);
		//randomscenariospage.RecurseEvery.click();
		BasePage.waitforElement(randomscenariospage.recendtime);
		randomscenariospage.recendtime.sendKeys("03/03/2019");
		BasePage.waitforElement(randomscenariospage.save);
		clickObj(randomscenariospage.save,"save");
		driver.close();
		System.out.println("TC37_BlockingAnEvent_Calendar_WeeklyRecurring is done");
	}
}

package com.training.test.home;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.page.LoginPage;
import com.training.page.OpportunityPage;
import com.training.utilities.CommonUtilities;

public class OpportunityTest extends BaseTest {
	LoginPage loginpage;
	OpportunityPage opportunitypage;
	CommonUtilities common = new CommonUtilities();

	@BeforeMethod
	public void beforeTest() throws IOException {
		launchapplication();
		loginpage = new LoginPage(driver);
		opportunitypage = new OpportunityPage(driver);
	}

	@Test(description = "TC-15 opportunitiesdropdown")
	public void OpportunitiesDropdown() throws Exception {
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
		clickObj(opportunitypage.OpportunitiesTab, "OpportunitiesTab");
		BasePage.waitforElement(opportunitypage.ClosePrompt);
		opportunitypage.ClosePrompt.click();
		Select dropdown = new Select(opportunitypage.dropdown);
		// Get all options
		List<WebElement> dd = dropdown.getOptions();

		// Get the length
		System.out.println(dd.size());

		// Loop to print one by one
		for (int j = 0; j < dd.size(); j++) {
			System.out.println(dd.get(j).getText());

		}
		driver.close();
		System.out.println("TC_15_opportunitiesdropdown is completed");
	}
	@Test(description = "TC-16 Create a new Opty")
	public void CreateOpty() throws Exception {
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
		clickObj(opportunitypage.OpportunitiesTab, "OpportunitiesTab");
		BasePage.waitforElement(opportunitypage.ClosePrompt);
		opportunitypage.ClosePrompt.click();
		clickObj(opportunitypage.Newbutton, "New_button");
		BasePage.waitforElement(opportunitypage.OpportunityName);
		opportunitypage.OpportunityName.clear();
		opportunitypage.OpportunityName.sendKeys("Long Term");
		opportunitypage.AccountName.sendKeys("Workday123");
		opportunitypage.AccNLookupWindow.click();
		String oldWindow = driver.getWindowHandle();
		//Switching driver control to new window.
				Set<String> getAllWindows = driver.getWindowHandles();
				String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
				driver.switchTo().window(getWindow[1]);
		//switch to first frame
				driver.switchTo().frame("searchFrame");
				driver.findElement(By.id("lksrch")).sendKeys("abc456");
				opportunitypage.GoButton.click();
				
				//Switching to Lookup Window
				driver.switchTo().defaultContent();
				
				//Switching to Insideframe(result)
				
				driver.switchTo().frame("resultsFrame");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//tr[@class='dataRow even last first']/th/a")).click();
				
				driver.switchTo().window(getWindow[0]);
				
				Thread.sleep(2000);
				//Coming out of the window to original window.
				driver.findElement(By.xpath("//input[@id='opp9']")).click();
				opportunitypage.Today.click();
				Actions action = new Actions(driver);
				action.sendKeys(Keys.ESCAPE).build().perform();
				opportunitypage.Stage.click();
				Select dropdown = new Select(opportunitypage.Stage);
				dropdown.selectByValue("Qualification");
				opportunitypage.Probablity.sendKeys("80");
				driver.close();
				System.out.println("TC16_CreatenewOpp is completed");
			}
	@Test(description = "TC_17_TestOpportunityPipelineReport")
	public void TestOpportunityPipelineReport() throws Exception {
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
		clickObj(opportunitypage.OpportunitiesTab, "OpportunitiesTab");
		BasePage.waitforElement(opportunitypage.ClosePrompt);
		opportunitypage.ClosePrompt.click();
		clickObj(opportunitypage.OpportunityPipeline, "Opportunity Pipeline");	
		driver.close();
		System.out.println("TC17_TestOpportunityPipeline is completed");
		}
	@Test(description = "TC_18_TestStuckOpportunitiesReport")
	public void TestStuckOpportunitiesReport() throws Exception {
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
		clickObj(opportunitypage.OpportunitiesTab, "OpportunitiesTab");
		BasePage.waitforElement(opportunitypage.ClosePrompt);
		opportunitypage.ClosePrompt.click();
		clickObj(opportunitypage.StuckOpp, "StuckOpp");
		driver.close();
		System.out.println("TC_18_TestStuckOpportunitiesReport is completed");
	}
	@Test(description = "TC_19_TestQuarterlySummaryReport")
	public void TestQuarterlySummaryReport() throws Exception {
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
		clickObj(opportunitypage.OpportunitiesTab, "OpportunitiesTab");
		BasePage.waitforElement(opportunitypage.ClosePrompt);
		opportunitypage.ClosePrompt.click();
		BasePage.waitforElement(opportunitypage.Interval);
		clickObj(opportunitypage.Interval, "Interval");
		Thread.sleep(5000);
		SelectbyText(opportunitypage.Interval,"Next FQ");
		SelectbyText(opportunitypage.include, "Open Opportunities");
		clickObj(opportunitypage.RunReport, "RunReport");
		driver.close();
		System.out.println("TC_19_TestQuarterlySummaryReport is completed");
	}
}
		
	
	


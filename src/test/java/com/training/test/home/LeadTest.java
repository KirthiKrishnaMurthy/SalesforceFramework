package com.training.test.home;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.page.LeadPage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class LeadTest extends BaseTest{
	LoginPage loginpage;
	LeadPage leadpage;
	CommonUtilities common = new CommonUtilities();

	@BeforeMethod
	public void beforeTest() throws IOException {
		launchapplication();
		loginpage = new LoginPage(driver);
		leadpage = new LeadPage(driver);
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
			clickObj(leadpage.Leads, "Leads");
			driver.close();
			System.out.println("TC20_LeadsTab is completed");	
	}


}

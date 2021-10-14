package com.training.test.home;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import com.training.base.BaseTest;
import com.training.page.LeadsPage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class ContactTest extends BaseTest {
	LoginPage loginpage;
	Contacts;
	CommonUtilities common = new CommonUtilities();

	@BeforeMethod
	public void beforeTest() throws IOException {
		launchapplication();
		loginpage = new LoginPage(driver);
		leadspage = new LeadsPage(driver);
	}
}

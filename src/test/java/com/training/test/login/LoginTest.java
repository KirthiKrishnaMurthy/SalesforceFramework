package com.training.test.login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class LoginTest extends BaseTest {

	static WebDriver driver;
	LoginPage login;
	HomePage home;
	CommonUtilities common = new CommonUtilities();

	@BeforeMethod
	public void beforeTest() throws IOException {
		driver = getDriver();
		String url = common.getApplicationProperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		home = new HomePage(driver);

	}

	@Test(description = "Login Error Message - 1")
	public void LoginErrorMessage1() throws InterruptedException, IOException {

		String Username = common.getApplicationProperty("Uname");
		login.enterintoUsername(Username);
		login.enterIntoPassword("wrongpassword");
		login.clickLoginButton();
		String errormessage = driver.findElement(By.xpath("//div[@id='error']")).getText();
		if (errormessage.equals("Please enter your password.")) {
			System.out.println("Error message is been be displayed");
		} else {
			System.out.println("Error message is not been be displayed");
		}

	}

	@Test(description = "Login To SalesForce -2")
	public void LoginToSalesForce2() throws Exception {

		String Username = common.getApplicationProperty("Uname");
		BaseTest.enterText(login.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		BaseTest.enterText(login.enterIntoPassword(), Password, "Passwordtext");
		BaseTest.selectCheckBox(login.checkRememberme(), "RememberMe");
		BaseTest.clickObj(login.LoginButton(), "Login");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
	}

	@Test(description = "Check RemeberMe - 3")
	public void Check_RemeberMe_3() throws Exception {
		String Username = common.getApplicationProperty("Uname");
		BaseTest.enterText(login.enterintoUsername(), Username, "Username");
		String Password = common.getApplicationProperty("pwd");
		BaseTest.enterText(login.enterIntoPassword(), Password, "Passwordtext");
		BaseTest.selectCheckBox(login.checkRememberme(), "RememberMe");
		BaseTest.clickObj(login.LoginButton(), "Login");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		if (actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
	}

	@Test(description = "Forgot Password- 4")
	public void Forgot_Password_4_A() throws Exception {
		String Username = common.getApplicationProperty("Uname");
		BaseTest.enterText(login.enterintoUsername(), Username, "Username");
		BaseTest.clickObj(login.forgotPassword(), "ForgotPassword");
		String Fname = common.getApplicationProperty("Fname");
		BaseTest.enterText(login.fullName(), Fname, "Fullname");
		BaseTest.clickObj(login.Continued(), "Continue");
	}

	@AfterMethod
	public void teardown() throws IOException {
		takescreenshot(driver); 
		driver.close();

	}

}
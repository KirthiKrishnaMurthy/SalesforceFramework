package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='username']")
	public WebElement Uname;
	@FindBy(xpath = "//input[@id='password']")
	public WebElement pwd;
	@FindBy(xpath = "//div[@id='error']")
	public WebElement errormessage;
	@FindBy(xpath = "//*[@id='Login']")
	public WebElement login;
	@FindBy(xpath = "//*[@id='rememberUn']")
	public WebElement remember;
	@FindBy(xpath = "//*[@id='forgot_password_link']")
	public WebElement Fpwd;
	@FindBy(xpath = ".//*[@id='un']")
	public WebElement Fname;
	@FindBy(xpath = "//*[@id='continue']")
	public WebElement Continue;
	/*
	 * @FindBy(xpath = ".//*[@id='un']") WebElement Conti;
	 */

	public void enterintoUsername(String strusername) {
		Uname.sendKeys(strusername);
	}

	public void enterIntoPassword(String strpassword) {
		pwd.sendKeys(strpassword);
	}

	public void clickLoginButton() {
		login.click();
	}

	public WebElement enterintoUsername() {
		return Uname;
	}

	public WebElement enterIntoPassword() {
		return pwd;
	}

	public WebElement checkRememberme() {
		return remember;
	}

	public WebElement LoginButton() {
		return login;
	}

	public WebElement forgotPassword() {
		return Fpwd;
	}

	public WebElement fullName() {
		return Fname;
	}

	public void logintapplication(String strusername, String strpassword) {
		Uname.sendKeys(strusername);
		pwd.sendKeys(strpassword);
		login.click();
	}

	public WebElement Continued() {
		
		return Continue;
	}

}
package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class LeadPage extends BasePage{

	public LeadPage(WebDriver driver) {
		super(driver);
		}
	
	//Elements For TC-20
	
	@FindBy(xpath = "//a[@title='Leads Tab']")
	public WebElement Leads;

}

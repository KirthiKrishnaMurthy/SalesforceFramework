package com.training.test.home;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.page.ContactsPage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class ContactsTest extends BaseTest {
	LoginPage loginpage;
	ContactsPage contactspage;
	CommonUtilities common = new CommonUtilities();

	@BeforeMethod
	public void beforeTest() throws IOException {
		launchapplication();
		loginpage = new LoginPage(driver);
		contactspage = new ContactsPage (driver);
	}
	@Test(description ="TC25_Createnewcontact ")
	public void Createnewcontact() throws Exception {
		//Launch and Login 
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
		//Click Contact Tab
		clickObj(contactspage.contact, "contact");
		BasePage.waitforElement(contactspage.ClosePrompt);
		contactspage.ClosePrompt.click();
		//Click New Button
		clickObj(contactspage.new_Element, "new_Element");
		//Enter First name
		BasePage.waitforElement(contactspage.first_name);
		enterText(contactspage.first_name, "Kirthi", "FirstName");
		//Enter Last name
		BasePage.waitforElement(contactspage.last_name);
		enterText(contactspage.last_name, "KrishnaMurthy", "LastName");
		//Enter Account Name
		BasePage.waitforElement(contactspage.account_name);
		enterText(contactspage.account_name, "Trade", "Accountname");
		clickObj(contactspage.save, "SaveButton");
		driver.close();
		System.out.println(" TC_25_Createnewcontact is completed");
	}
	@Test(description ="TC26_CreatenewviewintheContactPage")
	public void CreatenewviewintheContactPage() throws Exception {
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
		//Click Contact Tab
		clickObj(contactspage.contact, "contact");
		BasePage.waitforElement(contactspage.ClosePrompt);
		contactspage.ClosePrompt.click();
		BasePage.waitforElement(contactspage.Contactnewview);
		clickObj(contactspage.Contactnewview, "Contactnewview");
		BasePage.waitforElement(contactspage.ViewNames);
		enterText(contactspage.ViewNames, "JKS" , "ViewName");
		contactspage.View_UniqueName.clear();
		BasePage.waitforElement(contactspage.View_UniqueName);
		enterText(contactspage.View_UniqueName, "JKS" , "ViewUniqueName");
		Thread.sleep(5000);
		clickObj(contactspage.save, "SaveButton");
		 driver.close();
		 System.out.println("TC_26_CreatenewviewintheContactPage is Completed"); 
		 }
		 @Test(description =" TC_27_Checkrecentlycreatedcontact")
		 public void Checkrecentlycreatedcontact() throws Exception {
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
				//Click Contact Tab
				clickObj(contactspage.contact, "contact");
				BasePage.waitforElement(contactspage.ClosePrompt);
				contactspage.ClosePrompt.click();
				selectByVisibleText(contactspage.Rec_Created, "Recently Created");
				driver.close();
				System.out.println("TC_27_Checkrecentlycreatedcontact is Completed");
				}
		 @Test(description ="TC_28_CheckMycontacts")
		 public void CheckMycontacts() throws Exception{
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
				//Click Contact Tab
				clickObj(contactspage.contact, "contact");
				BasePage.waitforElement(contactspage.ClosePrompt);
				contactspage.ClosePrompt.click();
				 selectByVisibleText(contactspage.Mycont_view, "My Contacts");
				 contactspage.GoButton.click(); 
					driver.close();
					System.out.println("TC28_MyContacts is Completed");
					}
		 @Test(description ="TC_29_ViewcontactinthecontactPage")
		 public void ViewcontactinthecontactPage() throws Exception{
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
				//Click Contact Tab
				clickObj(contactspage.contact, "contact");
				BasePage.waitforElement(contactspage.ClosePrompt);
				contactspage.ClosePrompt.click();
				BasePage.waitforElement(contactspage.Contactname);
				clickObj(contactspage.Contactname, "Contactname");
				driver.close();
				System.out.println("TC_29_ViewcontactinthecontactPage is completed");
				}
		 @Test(description ="TC_30_ChecktheContactErrormessage")
		 public void ChecktheContactErrormessage() throws Exception{
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
				//Click Contact Tab
				clickObj(contactspage.contact, "contact");
				BasePage.waitforElement(contactspage.ClosePrompt);
				contactspage.ClosePrompt.click();
				BasePage.waitforElement(contactspage.Contactnewview);
				clickObj(contactspage.Contactnewview, "Createnewview");
				BasePage.waitforElement(contactspage.View_UniqueName);
				enterText(contactspage.View_UniqueName, "abc456" , "UniqueName");
				BasePage.waitforElement(contactspage.save);
				contactspage.save.click();
				String actualmsg = contactspage.Contactnewview.getText();
				String errormsg = "Error: You must enter a value";
				validateErrormsg(actualmsg, errormsg);
				driver.close();
				System.out.println("TC_30_ChecktheContactErrormessage is Completed");
				}
		 @Test(description ="TC_31_CheckingCancelbutton")
		 public void CheckingCancelbutton() throws Exception {
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
				//Click Contact Tab
				clickObj(contactspage.contact, "contact");
				BasePage.waitforElement(contactspage.ClosePrompt);
				contactspage.ClosePrompt.click();
				BasePage.waitforElement(contactspage.Contactnewview);
				clickObj(contactspage.Contactnewview, "Createnewview");
				BasePage.waitforElement(contactspage.name);
				enterText(contactspage.name, "Asdf" , "Name");
				BasePage.waitforElement(contactspage.View_UniqueName);
				enterText(contactspage.View_UniqueName, "Asdf" , "UniqueName");
				Thread.sleep(3000);
				clickObj(contactspage.cancel, "cancel");
				driver.close();
				System.out.println("TC_31_CheckingCancelbutton is Completed");
				}
		 @Test(description ="TC_32_CheckingSaveandNewbutton")
		 public void CheckingSaveandNewbutton() throws Exception {
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
				//Click Contact Tab
				clickObj(contactspage.contact, "contact");
				BasePage.waitforElement(contactspage.ClosePrompt);
				contactspage.ClosePrompt.click();
				//Click New Button
				clickObj(contactspage.new_Element, "new_Element");
				//Enter First name
				BasePage.waitforElement(contactspage.first_name);
				enterText(contactspage.first_name, "Kirthi", "FirstName");
				//Enter Last name
				BasePage.waitforElement(contactspage.last_name);
				enterText(contactspage.last_name, "Indian", "LastName");
				//Enter Account Name
				BasePage.waitforElement(contactspage.account_name);
				enterText(contactspage.account_name, "Global Media", "Accountname");
				BasePage.waitforElement(contactspage.SaveandNew);
				contactspage.SaveandNew.click();
				driver.close();
				System.out.println("TC_32_CheckingSaveandNewbutton is Completed");
		 }
		 
}

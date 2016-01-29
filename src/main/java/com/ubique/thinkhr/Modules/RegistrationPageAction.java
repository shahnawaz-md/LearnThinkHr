package com.ubique.thinkhr.Modules;

import org.openqa.selenium.JavascriptExecutor;

import com.ubique.thinkhr.Pages.RegistrationPage;
import com.ubique.thinkhr.Test.SelTestCase;
import com.ubique.thinkhr.Utils.Log;


public class RegistrationPageAction extends SelTestCase {
	
	public static void eventsExecuteOnRegistrationPage(String CompanyAuthorizationKey, String FirstName, String LastName, 
			String Email, String CreatePassword, String ConfirmPassword) throws InterruptedException {
		
		RegistrationPage.menuButton.click();
		Thread.sleep(2000);
		Log.info("Clicking on Menu Button");
		
		RegistrationPage.signUpButton.click();
		Thread.sleep(2000);
		Log.info("Clicking on SignUp Button");
		
		RegistrationPage.enterCompanyAuthorizationKey.clear();
		RegistrationPage.enterCompanyAuthorizationKey.sendKeys(CompanyAuthorizationKey);
		Thread.sleep(2000);
		Log.info("Entering Company Authorization Key");
		
		RegistrationPage.unmaskChbxAuthorizationKey.click();
		Thread.sleep(2000);
		Log.info("Clicking on Unmask Checkbox of Company Authorization Key");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		
		Log.info("Scrolling down the page");
		
		RegistrationPage.continueButton.click();
		Thread.sleep(2000);
		Log.info("Clicking on Continue Button");
		
		RegistrationPage.firstName.sendKeys(FirstName);
		Thread.sleep(2000);
		Log.info("Entering First Name");
		
		RegistrationPage.lastName.sendKeys(LastName);
		Thread.sleep(2000);
		Log.info("Entering Last Name");
		
		RegistrationPage.emailId.sendKeys(Email);
		Thread.sleep(2000);
		Log.info("Entering Email Id");
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,1000)", "");
		
		Log.info("Scrolling down the page");
		
		RegistrationPage.createPassword.sendKeys(CreatePassword);
		Thread.sleep(2000);
		Log.info("Entering Create Password");
		
		RegistrationPage.unmaskChbxCreatePassword.click();
		Thread.sleep(2000);
		Log.info("Clicking on Unmask Checkbox of Create Password");
		
		RegistrationPage.confirmPassword.sendKeys(ConfirmPassword);
		Thread.sleep(2000);
		Log.info("Entering Confirm Password");
		
		RegistrationPage.unmaskChbxConfirmPassword.click();
		Thread.sleep(2000);
		Log.info("Clicking on Unmask Checkbox of Confirm Password");
		
		RegistrationPage.submitButton.click();
		Thread.sleep(2000);
		Log.info("Clicking on Submit Button");
		
		
	}

}

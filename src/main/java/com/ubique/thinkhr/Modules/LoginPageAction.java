package com.ubique.thinkhr.Modules;

import com.ubique.thinkhr.Pages.LoginPage;
import com.ubique.thinkhr.Test.SelTestCase;
import com.ubique.thinkhr.Utils.Log;


public class LoginPageAction extends SelTestCase {
	
	public static void eventsExecuteOnLoginPage() throws InterruptedException {
		
		LoginPage.link_login.click();
		Thread.sleep(2000);
		Log.info("Clicking on Login Link");
		
		LoginPage.txtbx_username.clear();
		Log.info("Clearing Username Textbox");
		LoginPage.txtbx_username.sendKeys("Miketestadmin");
		Thread.sleep(2000);
		Log.info("Entering Username");
		
		LoginPage.txtbx_password.clear();
		Log.info("Clearing Password Textbox");
		LoginPage.txtbx_password.sendKeys("partha");
		Thread.sleep(2000);
		Log.info("Entering Password");
		
		LoginPage.chckbx_remember_me.click();
		Thread.sleep(2000);
		Log.info("Clicking on RememberMe CheckBox");
		
		LoginPage.btn_login.click();
		Thread.sleep(2000);
		Log.info("Clicking on Login Button");
		
	
	}

}

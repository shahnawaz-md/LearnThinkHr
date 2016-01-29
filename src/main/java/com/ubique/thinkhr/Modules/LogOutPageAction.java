package com.ubique.thinkhr.Modules;

import com.ubique.thinkhr.Pages.LogOutPage;
import com.ubique.thinkhr.Test.SelTestCase;
import com.ubique.thinkhr.Utils.Log;

public class LogOutPageAction extends SelTestCase {
	
	public static void eventsExecuteOnLogOutPage() throws InterruptedException {
		
		LogOutPage.button_LogOut.click();
		Thread.sleep(2000);
		Log.info("Clicking on LogOut Button");
		
		
	}

}

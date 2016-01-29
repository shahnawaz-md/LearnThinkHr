package com.ubique.thinkhr.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ubique.thinkhr.Modules.LogOutPageAction;
import com.ubique.thinkhr.Modules.LoginPageAction;
import com.ubique.thinkhr.Modules.MyCoursesPageAction;
import com.ubique.thinkhr.Pages.LogOutPage;
import com.ubique.thinkhr.Pages.LoginPage;
import com.ubique.thinkhr.Pages.MyCoursesPage;
import com.ubique.thinkhr.Utils.Log;

public class SanityTest1 extends SelTestCase {
	
	@Test
	public void Login() {
		
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, MyCoursesPage.class);
		PageFactory.initElements(driver, MyCoursesPage.InProgressCourses.class);
		PageFactory.initElements(driver, MyCoursesPage.InProgressCourses.CompletedCourses.class);
		PageFactory.initElements(driver, LogOutPage.class);
		
		try{
			LoginPageAction.eventsExecuteOnLoginPage();
			Log.info("Login done successfully");
		
		}catch(Exception e){
			Log.info("Login not done successfully");
			e.printStackTrace();
		}
		
		try{
			MyCoursesPageAction.executeEventsOnMyCoursesPage();
			Log.info("MyCourses events performed successfully");
		
		}catch(Exception e){
			Log.info("MyCourses events not performed successfully");
			e.printStackTrace();
		}
		
		
		try{
			LogOutPageAction.eventsExecuteOnLogOutPage();
			Log.info("LogOut done successfully");
		
		}catch(Exception e){
			Log.info("LogOut not done successfully");
			e.printStackTrace();
		}
		
	}

}

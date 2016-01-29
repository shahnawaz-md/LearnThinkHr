package com.ubique.thinkhr.Modules;

import com.ubique.thinkhr.Pages.MyCoursesPage;
import com.ubique.thinkhr.Test.SelTestCase;
import com.ubique.thinkhr.Utils.Log;

public class MyCoursesPageAction extends SelTestCase {
	
	public static void executeEventsOnMyCoursesPage() throws InterruptedException {
		
		MyCoursesPage.button_MyCourses.click();
		Thread.sleep(2000);
		Log.info("Clicking on My Courses Button");
		
		MyCoursesPage.InProgressCourses.lnk_InprogessCourses.click();
		Thread.sleep(2000);
		Log.info("Clicking on In Progress Courses link");
		
		MyCoursesPage.lnk_Thinkhr.click();
		Thread.sleep(2000);
		Log.info("Clicking on ThinkHr link");
		
		MyCoursesPage.button_MyCourses.click();
		Thread.sleep(2000);
		Log.info("Clicking on My Courses Button");
		
		MyCoursesPage.InProgressCourses.CompletedCourses.lnk_CompleteCourses.click();
		Thread.sleep(2000);
		Log.info("Clicking on Completed Courses link");
		
		MyCoursesPage.lnk_Thinkhr.click();
		Thread.sleep(2000);
		Log.info("Clicking on ThinkHr link");
		
	}

}

package com.ubique.thinkhr.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyCoursesPage {
	
	private WebDriver driver;
	
	public MyCoursesPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='bs-example-navbar-collapse-1']/ul[4]/li/a")
	public static WebElement button_MyCourses;
	
	@FindBy(how = How.XPATH, using = "html/body/div[1]/div[2]/div/nav/div/div[1]/a[2]/img")
	public static WebElement lnk_Thinkhr;
	
	
	public static class InProgressCourses {
		
		@FindBy(how = How.XPATH, using = ".//*[@id='bs-example-navbar-collapse-1']/ul[4]/li/ul/div[1]/h6/a")
		public static WebElement lnk_InprogessCourses;
		
		public static class CompletedCourses {
			
			@FindBy(how = How.XPATH, using = ".//*[@id='bs-example-navbar-collapse-1']/ul[4]/li/ul/div[13]/h6/a")
			public static WebElement lnk_CompleteCourses;
			
		}
		
	}

}

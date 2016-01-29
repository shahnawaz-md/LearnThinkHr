package com.ubique.thinkhr.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogOutPage {
	
private WebDriver driver;
	
	public LogOutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='bs-example-navbar-collapse-1']/ul[2]/div/div/a[2]")
	public static WebElement button_LogOut;

}

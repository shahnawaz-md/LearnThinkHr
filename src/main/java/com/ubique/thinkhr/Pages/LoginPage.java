package com.ubique.thinkhr.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}	
		
	@FindBy(how = How.XPATH, using = ".//*[@id='bs-example-navbar-collapse-1']/ul[2]/div/div/a")
	public static WebElement link_login;
	
	@FindBy(how = How.ID, using = "username")
	public static WebElement txtbx_username;
	
	@FindBy(how = How.ID, using = "password")
	public static WebElement txtbx_password;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='login']/div[1]/div[1]/div/div/label/div/ins")
	public static WebElement chckbx_remember_me;
	
	@FindBy(how = How.XPATH, using =".//*[@id='login']/div[2]/div/button")
	public static WebElement btn_login;
		

}

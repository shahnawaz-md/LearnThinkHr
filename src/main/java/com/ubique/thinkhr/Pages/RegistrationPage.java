package com.ubique.thinkhr.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {
	
	private WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='bs-example-navbar-collapse-1']/ul[1]/li/a")
	public static WebElement menuButton;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='mm-0']/p/a")
	public static WebElement signUpButton;
	
	@FindBy(how = How.ID, using = "id_company_key")
	public static WebElement enterCompanyAuthorizationKey;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='mform3']/fieldset/div/div[2]/div[1]/div/div/span/label/div/ins")
	public static WebElement unmaskChbxAuthorizationKey;
	
	@FindBy(how = How.ID, using = "SubmitSelfRegistration")
	public static WebElement continueButton;
	
	@FindBy(how = How.ID, using = "id_firstname")
	public static WebElement firstName;
	
	@FindBy(how = How.ID, using = "id_lastname")
	public static WebElement lastName;
	
	@FindBy(how = How.ID, using = "id_email")
	public static WebElement emailId;
	
	@FindBy(how = How.ID, using = "id_password")
	public static WebElement createPassword;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='mform3']/fieldset/div[1]/div[2]/div[2]/div[6]/div[1]/div[1]/span/label/div")
	public static WebElement unmaskChbxCreatePassword;
	
	@FindBy(how = How.ID, using = "id_confirm_password")
	public static WebElement confirmPassword;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='mform3']/fieldset/div[1]/div[2]/div[2]/div[7]/div/div/span/label/div")
	public static WebElement unmaskChbxConfirmPassword;
	
	@FindBy(how = How.ID, using = "SubmitSelfRegistration")
	public static WebElement submitButton;
	
	
	

}

package com.ubique.thinkhr.Test;

import java.io.File;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ubique.thinkhr.Modules.RegistrationPageAction;
import com.ubique.thinkhr.Pages.RegistrationPage;
import com.ubique.thinkhr.Utils.Excelutils;
import com.ubique.thinkhr.Utils.Log;



public class SanityTest extends SelTestCase {
	
	@Test(dataProvider = "SignUp")
	public void Registration(String CompanyAuthorizationKey, String FirstName, String LastName,
			String Email, String CreatePassword, String ConfirmPassword) {
		System.out.println("AAAAAAAAAAAAAAA : ");
		PageFactory.initElements(driver, RegistrationPage.class);
		
		try{
			RegistrationPageAction.eventsExecuteOnRegistrationPage(CompanyAuthorizationKey,
					FirstName, LastName, Email, CreatePassword, ConfirmPassword);
			Log.info("Registration done successfully");
		
		}catch(Exception e){
			Log.info("Registration not done successfully");
			e.printStackTrace();
		}
		
	}
	
	@DataProvider(name = "SignUp")
	public Object[][] getSignUpData() throws Exception {
		System.out.println(new File(".").getAbsolutePath());
		Object[][] cellData = Excelutils.getInstance().readData("D:\\practiseworkspace\\LearnThinkHr-P2\\src\\test\\resources\\Registration.xls", 0);
		System.out.println("MMMMMM : " + cellData);
		return cellData;
	
	}
	
}	
	


	
	
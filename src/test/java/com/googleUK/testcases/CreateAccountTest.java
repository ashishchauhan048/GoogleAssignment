package com.googleUK.testcases;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.googleUK.pages.GoogleUK_CreateAccount_Page;
import com.googleUK.pages.GoogleUK_HomePage;
import com.googleUK.pages.Google_UK_Landing_Page;

public class CreateAccountTest extends TestBase {
	
	Google_UK_Landing_Page lp = null;
	GoogleUK_CreateAccount_Page cp = null;
	
	@BeforeTest
	
	public void init() throws Exception{
		
		
		
		initiConfig();
		initDriver();
		
		
		
	}
	
	@Test
	
	public void validateMesage(){
		
		
		
		
		GoogleUK_HomePage hp = PageFactory.initElements(driver, GoogleUK_HomePage.class);
		 lp = hp.clickOnGmailLink();
		
		 cp = lp.clickOnCreateAccountButton();
		
		cp.validateMessage();
		
		
		
	}
	
	@AfterTest
	
	public void closeBrowser(){
		
		browserClose();
		
	}
	
	


}

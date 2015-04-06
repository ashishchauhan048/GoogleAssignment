package com.googleUK.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.googleUK.util.constants;

public class Google_UK_Landing_Page {
	
	public WebDriver driver;
	
	public Google_UK_Landing_Page(WebDriver dr){
		
		driver=dr;
		
		
	}
	
	@FindBy(xpath =constants.createAccountButton)
	
	public WebElement createAccount;
	
	
	public GoogleUK_CreateAccount_Page clickOnCreateAccountButton(){
		
		
		
		createAccount.click();
		
		return PageFactory.initElements(driver, GoogleUK_CreateAccount_Page.class);
		
		
		
	}
	
	

}

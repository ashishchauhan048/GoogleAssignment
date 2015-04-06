package com.googleUK.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.googleUK.util.constants;

public class GoogleUK_HomePage {
	
	
	public WebDriver driver;
	
	
	
	public GoogleUK_HomePage(WebDriver dr){
		
		driver = dr;
		
		
	}
	
	@FindBy(xpath=constants.gmailLink)
	public WebElement gmail_Link;
	
	public Google_UK_Landing_Page clickOnGmailLink(){
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		
		
		driver.get("https://www.google.co.uk/");
		 gmail_Link.click();
		 
		 return PageFactory.initElements(driver, Google_UK_Landing_Page.class);

		
	}
	
	
	
	
	

}

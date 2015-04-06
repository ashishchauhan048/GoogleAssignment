package com.googleUK.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.googleUK.util.ErrorUtil;
import com.googleUK.util.constants;

public class GoogleUK_CreateAccount_Page {
	
	
	
	public WebDriver driver;
	
	public GoogleUK_CreateAccount_Page(WebDriver dr){
		
		driver = dr;
		
	}
	
	@FindBy(xpath = constants.name_xpath)
	
	public WebElement name;
	@FindBy(xpath = constants.lastName_xpath)
	public WebElement lastName;
	
	@FindBy(xpath = constants.passwd_xpath)
	public WebElement passwd;
	
	@FindBy(xpath = constants.passwdAgain_xpath)
	public WebElement passwdAgain;
	
	@FindBy(xpath = constants.monthBox_xpath)
	public WebElement monthBox;
	 
	
	@FindBy(xpath = constants.month_xpath)
	public WebElement month;
	
	@FindBy(xpath = constants.days_xpath)
	public WebElement days;
	
	@FindBy(xpath = constants.year_xpath)
	
	public WebElement year;
	
	@FindBy(xpath = constants.genderBox_xpath)
	public WebElement genderBox; 
	
	@FindBy(xpath = constants.gender_xpath)
	public WebElement gender;

	
	@FindBy(xpath = constants.phoneNo_xpath)
	public WebElement phoneNo;
	
	@FindBy(xpath = constants.emailId_xpath)
	public WebElement emailId;
	
	@FindBy(xpath = constants.skip_xpath)
	public WebElement skip;
	
	@FindBy(xpath = constants.Terms_xpath)
	public WebElement Terms;
	
	@FindBy(xpath = constants.submitButton_xpath)
	public WebElement submitButton;
	
	@FindBy(xpath = constants.message_xpath)
	public WebElement message;
	
	
	public void validateMessage(){
		
		
		name.sendKeys("Mayur");
		lastName.sendKeys("Sahu");
		passwd.sendKeys("neunzehn@1234");
		passwdAgain.sendKeys("neunzehn@1234");
		monthBox.click();
		month.click();
		days.sendKeys("18");
		year.sendKeys("1990");
		genderBox.click();
		gender.click();
		phoneNo.sendKeys("8551003014");
		emailId.sendKeys("mayur@gmail.com");
		skip.click();
		Terms.click();
		submitButton.click();
		String x =message.getText();
		
		Assert.assertEquals(x, "You can't leave this empty.");

		    	

		    	
		    }
			
	    	
	    
	    	
	    }
			

			

		
		
		
		
		
	
	


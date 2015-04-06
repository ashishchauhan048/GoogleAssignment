package com.googleUK.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;






public class TestBase {
	
	public static Properties config=null;
	
	public static WebDriver driver=null;
	
	
	

	public void initiConfig() throws Exception{
		
		if(config == null){
			
			

		
		config = new Properties();
		
		FileInputStream ip = new FileInputStream((System.getProperty("user.dir"))+"\\src\\test\\java\\com\\googleUK\\config\\CONFIG.properties");
		
		config.load(ip);
		
		}
		
	}
	
	public void initDriver(){
		
		if(driver==null){
			
			if(config.getProperty("browserType").equals("Mozilla")){
				driver=new FirefoxDriver();
				}
			else if(config.getProperty("browserType").equals("IE")){
				System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
				
				driver=new InternetExplorerDriver();
				
			}
			else if(config.getProperty("browserType").equals("ChromeDriver")){
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				driver=new ChromeDriver();
			
			
			}
			
			
		}
		
		
	}
	
	
	public void browserClose(){
		
		driver.quit();
		
		
		
	}

}

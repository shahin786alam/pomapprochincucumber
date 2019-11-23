package com.qa.free.crm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.free.crm.base.TestBase;

public class Loginpage extends TestBase {
	
	//page Factory - OR : define 2 Way
		@FindBy(name="username") //we can use like this line (define number one)
		//@CacheLookup
		WebElement username; 
		
		@FindBy(name="password")//we can use like this line too.(define number two)
		//@CacheLookup
		WebElement password;
		
		@FindBy(xpath="//input[@type='submit' and @value='Login' and @class='btn btn-small']")
		//@CacheLookup
		WebElement LoginBtn;
		
		@FindBy(xpath="//a[contains(text(),'Sign Up')]")
		WebElement signUpBtn;
		
		@FindBy(xpath="/html/body/div[2]/div/div[1]/a/img")
		WebElement CRMLogo;
		
		//Initializing the page Objects:
		public Loginpage() {
			PageFactory.initElements(driver, this);
		}
		
		
		//Actions:
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}  
		
		public boolean validateCRMImage() {
			return CRMLogo.isDisplayed();
		}
	
		public Homepage Loging(String un, String pwd) {
			username.sendKeys(un);
			password.sendKeys(pwd);
			//LoginBtn.click();
			//click on LoginBtn element by using js executor
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();",LoginBtn);
		
			return new Homepage();
		}
		
}




package com.qa.free.crm.step.definition;

import com.qa.free.crm.base.TestBase;
import com.qa.free.crm.pages.Homepage;
import com.qa.free.crm.pages.Loginpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class StepDefinitionsFile extends TestBase {
	
	//create Loginpage object to call all the method from Loginpage.
	Loginpage loginpage;
	Homepage homepage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() {
	  TestBase.initialization(); 
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page(){
		loginpage=new Loginpage();
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	}

	@Then("^user logs in to app$")
	public void user_logs_in_to_app() {
		homepage=loginpage.Loging(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Then("^validate home page title$")
	public void validate_home_page_title() {
		String hometitle=homepage.verifyHomePageTitle();
		Assert.assertEquals("CRMPRO",hometitle);
	}

//	@Then("^validate logged in username$")
//	public void validate_logged_in_username() {
//		boolean bool=homepage.verifyCorrectUserName();
//		Assert.assertTrue(bool);
//	}
	
	@Then("^user close the browser$")
	public void user_close_the_browser() {
		driver.quit();
	}

}

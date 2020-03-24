package com.Opencart.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Opencart.pagesobjects.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps 
{
	WebDriver driver;
	public LoginPage lp=new LoginPage(driver);
	

@Given("^the user launch the browser for login$")
public void the_user_launch_the_browser_for_login() throws Throwable 
{
	lp.url("chrome","https://demo.opencart.com/");
}

@When("^the  user opens opencart login page$")
public void the_user_opens_opencart_login_page() throws Throwable 
{
	lp.opencart_login();
}

@Then("^The user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void the_user_enters_the_valid_login_details(String emailid,String pass) throws Throwable 
{
	lp.login_details(emailid,pass);
	Thread.sleep(2000);
}

@Then("^the user close the opencart login page$")
public void the_user_close_the_opencart_login_page() throws Throwable 
{
	lp.quit();
}


}

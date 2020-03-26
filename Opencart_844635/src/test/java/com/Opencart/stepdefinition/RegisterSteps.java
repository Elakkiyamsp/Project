package com.Opencart.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Opencart.pagesobjects.RegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSteps 
{
	WebDriver driver;
	public RegisterPage rp=new RegisterPage();
	

@Given("^the user launch the browser for register$")
public void the_user_launch_the_browser_for_register() throws Throwable {
	rp.url("chrome","https://demo.opencart.com/");
}

@When("^the  user opens opencart register page$")
public void the_user_opens_opencart_register_page() throws Throwable {
	rp.opencart_register();
}

@Then("^the user enters the valid register details$")
public void the_user_enters_the_valid_register_details() throws Throwable {
	rp.register_details();
	rp.screenshot("src\\test\\resources\\Screenshot\\register.png");
}

@Then("^the user close the opencart register page$")
public void the_user_close_the_opencart_register_page() throws Throwable {
	rp.quit();
}


}

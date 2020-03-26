package com.Opencart.stepdefinition;

import com.Opencart.pagesobjects.DesktopPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DesktopSteps 
{
	DesktopPage dp=new DesktopPage();
	
	@Given("^launching browser$")
	public void launching_browser() throws Throwable 
	{
		dp.launching_browser("chrome");
	   
	}
	
	@When("^the user opens the home page$")
	public void the_user_opens_the_home_page() throws Throwable 
	{
		dp.opencart_page();
	   
	}

	@Then("^the user select the desktop$")
	public void the_user_select_the_desktop() throws Throwable 
	{
		dp.select_desktop();
		dp.screenshot("src\\test\\resources\\Screenshot\\desktop.png");
	}
	
	@Then("^the user close the browser$")
	public void the_user_close_the_browser() throws Throwable 
	{
		dp.close_browser();
	 
	}

}

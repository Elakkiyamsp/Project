package com.Opencart.stepdefinition;

import com.Opencart.excelutility.ExcelData;
import com.Opencart.pagesobjects.AddressBookPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddressBookSteps 
{
	AddressBookPage address = new  AddressBookPage();
	ExcelData excel=new ExcelData();

	@Given("^the user launch the browser for address book scenario$")
	public void the_user_launch_the_browser_for_address_book_scenario() throws Throwable 
	{
		address.browser("chrome");

	}

	@When("^the user opens the webpage$")
	public void the_user_opens_the_webpage() throws Throwable 
	{
		address.url(excel.excel_emailid(1),excel.excel_password(1));

	}

	@Then("^the user enters the address book details$")
	public void the_user_enters_the_address_book_details() throws Throwable 
	{
		address.address_entry();
		address.screenshot("src\\test\\resources\\Screenshot\\address.png");

	}

	@Then("^the user close the webpage$")
	public void the_user_close_the_webpage() throws Throwable 
	{
		address.close();

	}


}

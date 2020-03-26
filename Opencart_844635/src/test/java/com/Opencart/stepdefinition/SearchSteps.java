package com.Opencart.stepdefinition;

import org.junit.Assert;

import com.Opencart.pagesobjects.SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps 
{
	SearchPage sp=new SearchPage();
	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable 
	{
	  sp.launch("chrome");
	}

	@When("^the user opens the opencart search page$")
	public void the_user_opens_the_opencart_search_page() throws Throwable 
	{
		sp.search_page();
	  
	}

	@Then("^the user search the product$")
	public void the_user_search_the_product() throws Throwable 
	{
		int link=sp.search_product();
		if(link>1) 
        {
			
			Assert.assertTrue(false);
			
		}
	}

	@Then("^the user close the search page$")
	public void the_user_close_the_search_page() throws Throwable 
	{
		sp.close_search();
	}

}

package com.Opencart.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/Opencart.feature",
		plugin = { "pretty","html:reports/cucumber-html-report","json:reports/cucumber-json-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/cucumber-extent-report/extentreport.html" },
		glue = {"com.Opencart.stepdefinition"},
		monochrome = true//readable
		)

public class OpencartRunner 
{
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
    }
}

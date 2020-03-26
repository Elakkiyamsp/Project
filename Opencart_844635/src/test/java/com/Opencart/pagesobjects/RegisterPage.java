package com.Opencart.pagesobjects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterPage 
{
	WebDriver driver;
	By my_account=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
	By register=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	By first_name=By.name("firstname");
	By last_name=By.name("lastname");
	By email=By.name("email");
	By telephone=By.name("telephone");
	By password=By.name("password");
	By confirm=By.name("confirm");
	By agree=By.name("agree");
	By register_submit=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	
	public void url(String browser,String url) 
	{
		try
		{
			//to launch chrome browser 
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
				driver=new ChromeDriver();
			}
			//to launch firefox browser
			else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","src/test/resources/Driver/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			driver.manage().window().maximize(); //maximize the window
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //code will wait for specified time before execution
			
		}
		
		catch(WebDriverException e)
		{
			//gets executed if above conditions fail
			System.out.println("Browser could not be launched"); 
		}
		
		driver.get(url); //get url from user

	}
	
	public void opencart_register()
	{
		driver.findElement(my_account).click(); //click my account
		driver.findElement(register).click(); //select register from my account
	}
	
	public void register_details() throws InterruptedException
	{
		driver.findElement(first_name).sendKeys("sound"); //get first name from user
		driver.findElement(last_name).sendKeys("m"); //get last name from user
		driver.findElement(email).sendKeys("soundaryariya27@gmail.com"); //get email from user
		driver.findElement(telephone).sendKeys("1234567890"); //get telephone from user
		driver.findElement(password).sendKeys("sound"); //get password from user
		driver.findElement(confirm).sendKeys("sound"); //confirms the entered password
		driver.findElement(agree).click(); //agree to the terms and condition
		driver.findElement(register_submit).click(); //click the submit button
		Thread.sleep(3000); 
	}
	
	// Used to take screenshot
		public void screenshot(String path) throws IOException {

			TakesScreenshot ts = (TakesScreenshot) driver;                                   //Creates object for screenshot class                       
			File SrcFile = ts.getScreenshotAs(OutputType.FILE);                             //Stores screenshot as file
			FileUtils.copyFile(SrcFile, new File(path));                                    //Copy the file in the given path
		}

	
	public void quit()
	{
		driver.close(); //close the browser
	}

	

}

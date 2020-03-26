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
import org.openqa.selenium.support.ui.Select;

public class AddressBookPage
{
	WebDriver driver;
	
	//Address book locators
	By my_account= By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i");
	By login=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By email=By.xpath("//*[@id=\"input-email\"]");
	By password=By.xpath("//*[@id=\"input-password\"]");
	By login_button=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	By address_book=By.linkText("Address Book");
	By new_address=By.linkText("New Address");
	By first_name=By.name("firstname");
	By last_name=By.name("lastname");
	By company=By.name("company");
	By address_1=By.name("address_1");
	By city=By.name("city");
	By postcode=By.name("postcode");	
	By confirm=By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");

	public void browser(String browser) 
	{
		try
		{
			//To launch chrome browser
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
				driver=new ChromeDriver();
			}
			//To launch firefox browser
			else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","src/test/resources/Driver/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			//To maximize the window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}
		
		catch(WebDriverException e)
		{
			//gets executed if above conditions fail
			System.out.println("Browser could not be launched");
		}
	}
	
	public void url(String emailid,String pass) //login to account
	{
		driver.get("https://demo.opencart.com/");
		driver.findElement(my_account).click();
		driver.findElement(login).click();
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login_button).click();
	}

	public void address_entry() throws InterruptedException //address book details are entered
	{
		driver.findElement(address_book).click();
		driver.findElement(new_address).click();
		driver.findElement(first_name).sendKeys("xxxx");
		driver.findElement(last_name).sendKeys("yyyy");
		driver.findElement(company).sendKeys("CTS");
		driver.findElement(address_1).sendKeys("14,OMR Street");
		driver.findElement(city).sendKeys("Chennai");
		driver.findElement(postcode).sendKeys("600 012");
		Thread.sleep(2000);
		Select country=new Select(driver.findElement(By.id("input-country")));
		country.selectByVisibleText("India");
		Thread.sleep(2000);
		Select state= new Select(driver.findElement(By.id("input-zone")));
		state.selectByVisibleText("Tamil Nadu");

		
		driver.findElement(confirm).click();
		Thread.sleep(5000);
	}
	
	// Used to take screenshot
		public void screenshot(String path) throws IOException {

			TakesScreenshot ts = (TakesScreenshot) driver;                                   //Creates object for screenshot class                       
			File SrcFile = ts.getScreenshotAs(OutputType.FILE);                             //Stores screenshot as file
			FileUtils.copyFile(SrcFile, new File(path));                                    //Copy the file in the given path
		}

	
	public void close() //close browser
	{
		driver.close();
	}
}



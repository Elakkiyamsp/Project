package com.Opencart.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchPage 
{
	WebDriver driver;
	
	//Search locators
	By search_box=By.xpath("//*[@id=\"search\"]/input");
	By imac=By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img");
	By price=By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/p[2]");

	public void launch(String browser) 
	{
		try
		{ //to launch chrome browser
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
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}
		
		catch(WebDriverException e)
		{
			//gets executed if above conditions fail
			System.out.println("Browser could not be launched"); 
		}
	}
	
	public void search_page()
	{
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle()); //prints the site name in console
	}
	
	public void search_product() throws InterruptedException
	{
		driver.findElement(search_box).sendKeys("IMAC"); //search the product given by user
		driver.findElement(search_box).sendKeys(Keys.ENTER);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement b=driver.findElement(imac);
		js.executeScript("arguments[0].scrollIntoView();", b); //scroll till the desired item is got
		
		String s=driver.findElement(price).getText(); //get the price name
		System.out.println(s); //print the price name
		Thread.sleep(3000);
	
	}
	
	public void close_search()
	{
		driver.close(); //close browser
	}

}

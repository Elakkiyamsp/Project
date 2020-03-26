package com.Opencart.pagesobjects;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	By macbook=By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div/div[1]/a/img");
	By image=By.tagName("a");
	

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
	
	public int search_product() throws InterruptedException
	{
		driver.findElement(search_box).sendKeys("MACBOOK"); //search the product given by user
		driver.findElement(search_box).sendKeys(Keys.ENTER);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement b=driver.findElement(macbook);
		js.executeScript("arguments[0].scrollIntoView();", b);   //scroll till the desired item is got
		
		List<WebElement> img=driver.findElements(image);
		int a=img.size();
		System.out.println("size"+a);
		 
		return a;
		
		
	
	}
	
	// Used to take screenshot
		public void screenshot(String path) throws IOException {

			TakesScreenshot ts = (TakesScreenshot) driver;                                   //Creates object for screenshot class                       
			File SrcFile = ts.getScreenshotAs(OutputType.FILE);                             //Stores screenshot as file
			FileUtils.copyFile(SrcFile, new File(path));                                    //Copy the file in the given path
		}

	
	public void close_search()
	{
		driver.close(); //close browser
	}

}

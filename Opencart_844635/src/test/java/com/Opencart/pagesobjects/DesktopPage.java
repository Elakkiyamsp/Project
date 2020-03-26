package com.Opencart.pagesobjects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DesktopPage 
{
	WebDriver driver;
	
	//Desktop locators
	By desktop_tab=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");
	By show_all_desktop=By.linkText("Show All Desktops");
	By desktop_mac=By.xpath("//*[@id=\"column-left\"]/div[1]/a[3]");
	By mac=By.linkText("iMac");
	By price=By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/p[2]");
	
	public void launching_browser(String browser) 
	{
		try
	{
		if(browser.equalsIgnoreCase("chrome"))//to launch chrome browser
		{
			System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))//to launch firefox browser
		{
			System.setProperty("webdriver.gecko.driver","src/test/resources/Driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//wait for specified time
		
	}
	
	catch(WebDriverException e)
	{
		//gets executed if above conditions fail
		System.out.println("Browser could not be launched");
	}
	}
	
	public void opencart_page()
	{
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());//print site name in console
	}
	
	public void select_desktop() throws InterruptedException
	{
		driver.findElement(desktop_tab).click();//click desktop
		driver.findElement(show_all_desktop).click();//available desktop is displayed
		driver.findElement(desktop_mac).click();//select mac from the list
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement c=driver.findElement(mac);
		js.executeScript("arguments[0].scrollIntoView();", c);//scroll till desired item is got
		Thread.sleep(3000);
		
		String s=driver.findElement(price).getText(); //get the price name
		System.out.println(s); //print the price name
		Thread.sleep(3000);
	}
	
	// Used to take screenshot
		public void screenshot(String path) throws IOException {

			TakesScreenshot ts = (TakesScreenshot) driver;                                   //Creates object for screenshot class                       
			File SrcFile = ts.getScreenshotAs(OutputType.FILE);                             //Stores screenshot as file
			FileUtils.copyFile(SrcFile, new File(path));                                    //Copy the file in the given path
		}

	public void close_browser()
	{
		driver.close();//close browser
	}

}

package com.Opencart.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AddToCartPage 
{
	WebDriver driver;
	
	//AddtoCart locators
	By product=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img");
	By add_to_cart_button=By.id("button-cart");
	By shopping_cart=By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i");	
			
	public void launch_browser(String browser) //browser is launched
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
			
			driver.manage().window().maximize();//maximize window
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}
		
		catch(WebDriverException e) //gets executed if above conditions fail
		{
			System.out.println("Browser could not be launched");
		}
		
	}
	
	public void opencart_website()
	{
		driver.get("https://demo.opencart.com/");//get site from user
		System.out.println(driver.getTitle());//print site name
	}
	
	public void add_to_cart() throws InterruptedException//add items to cart
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement a=driver.findElement(product);
		js.executeScript("arguments[0].scrollIntoView();", a);//scroll page to view product
		driver.findElement(product).click();//add product to cart
		
		WebElement b=driver.findElement(add_to_cart_button);
		js.executeScript("arguments[0].scrollIntoView();", b);//scroll to view the product
		driver.findElement(add_to_cart_button).click();
		Thread.sleep(3000);

		driver.findElement(shopping_cart).click();//click shopping cart
		Thread.sleep(3000);
	}
	
	public void close_website()
	{
		driver.close(); //close browser
	}

}

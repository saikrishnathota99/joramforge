package com.Amazon.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConsts{
	
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		Filelib flib=new Filelib();
		String browserName=flib.getpropData(PROP_PATH,"browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			
				System.setProperty(CHROME_KEY, CHROME_VALUE);
		
				driver = new ChromeDriver();
	}
		
	else if(browserName.equalsIgnoreCase(" firefox ")) {
		
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		 
		driver=new FirefoxDriver();
	}

	else
	{
		System.out.println(" enter browser name ");
		}
	driver.manage().window().maximize();
	String appUrl= flib.getpropData(PROP_PATH," url ");
	Thread.sleep(30000);
	driver.get(appUrl);
	
	String actualTitle=driver.getTitle();
	String expectedTitle=flib.getpropData(PROP_PATH," homeTitle ");
	WebDriverCommonLib wlib= new WebDriverCommonLib();
	wlib.verify(actualTitle, expectedTitle, " Home Page ");
	}
	
	@AfterMethod
	public void closeBrowser() {
	driver.quit();
		
	}
}


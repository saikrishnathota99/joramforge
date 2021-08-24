package com.Amazon.genericlib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;


public class WebDriverCommonLib extends BaseTest {
	
	public String getPageTitle()
	{
		String pageTitle=driver.getTitle();
		return pageTitle;
	}
	
	public void WiatForPageLoad(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.titleContains(title));
	}
	public void SelectOption(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void SelectOption(String value,WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}

	public void SelectOption(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void mouseHover(WebElement element)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
	}
	
	public void verify(String actual,String expected,String page)
	{
		Assert.assertEquals(actual, expected);
		Reporter.log(page+" is Displayed PASS ",true);
		
	}

	public String getpageTitle() {
		String pageTitle=driver.getTitle();
		return pageTitle;
	}

	public void waitforPageload(String title) {
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.titleContains(title));
		
	}

	public void getPageScreenshot(String path) {
		{
			TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(path);
			try {
				Files.copy(src, dest);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		}
		
		public void getElementScreenshot(String path,WebElement element)
		{
			TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(path);
			try {
				Files.copy(src, dest);
			}catch(IOException e) {
				e.printStackTrace();
			}
		
	}
	
}

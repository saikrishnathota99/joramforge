package com.Amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.genericlib.BaseTest;

public class HomePage extends BaseTest{

	// In Home Page Searching for item
	
	@FindBy(id="twotabsearchtextbox") private WebElement searchBox;
	@FindBy(xpath="//input[@value='Go']") private WebElement searchBtn;
	
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}


	public WebElement getSearchBox() {
		return searchBox;
	}


	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public void searchBox() {
		searchBox.sendKeys("jbl headphones");
	}
	
	public void clickOnSearchBtn() {
	searchBtn.click();
	}
}

package com.joramforge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.joramforge.genericlib.BaseTest;

public class HomePage {

	//storing the elements address of home page here
	//Declaration
	
	@FindBy(xpath="//a[text()='Campaigns']") private WebElement campaignLink;
	
	
	//Initialisation
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	//Utilisation
		//Address returning method
		
	public WebElement getCampaignLink() {
		return campaignLink;
	}
	
	//Action Performing method
	 public void clickOnCamapaignLink()
	 {
		 campaignLink.click();
	 }
}	
	

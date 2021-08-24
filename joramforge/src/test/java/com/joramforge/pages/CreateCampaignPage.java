package com.joramforge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.joramforge.genericlib.BaseTest;

public class CreateCampaignPage {
	
	@FindBy(name="property(Campaign Name)") private WebElement campaignName;
	@FindBy(xpath="//div[@class='bodyText mandatory']/following-sibling::table[2]//input[@value='Save']") private  WebElement saveBtn;
	
	
	public CreateCampaignPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getCompaignName() {
		return campaignName;
	}

	
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void enterCampaignName(String campaignname)
	{
		campaignName.sendKeys(campaignname);
	}
	
	public void clickOnSaveBtn()
	{
		saveBtn.click();
	
	
	}	
		
	}
		


package com.joramforge.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.joramforge.genericlib.BaseTest;

public class DisplayCustomViewPage {

	
	@FindBy(xpath="//input[@value='New Campaign']") private WebElement newCampaignBtn;
	@FindBy(xpath="//table[@class='secContent']//tbody//tr[*]//td[@class=\"tableData\"][3]") private List<WebElement> campaignList;
	public DisplayCustomViewPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getNewCampaignBtn() {
		return newCampaignBtn;
	}
	
// Action: clicking on new campaign button	
	
	public void clickOnNewCampaignBtn()
	{
		newCampaignBtn.click();
		
	}

	public void verifyCampaignCreation(String campaign) {
		for( WebElement oneCampaign:campaignList) {
			String campaignName=oneCampaign.getText();
			if(campaignName.equals(campaignName)) {
				Reporter.log(" our campaign is created ",true);
				break;
			}
			else {
				Reporter.log(" our campaign is not created ");
				}
			}
		
	}

	
		
	}

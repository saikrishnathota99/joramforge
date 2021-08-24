package com.joramforge.initative;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.joramforge.genericlib.BaseTest;
import com.joramforge.genericlib.Filelib;
import com.joramforge.genericlib.WebDriverCommonLib;
import com.joramforge.pages.CreateCampaignPage;
import com.joramforge.pages.DisplayCustomViewPage;
import com.joramforge.pages.HomePage;

@Listeners(com.joramforge.genericlib.MyListeners.class)

public class VerifyCampaignCreation extends BaseTest {
	
	@Test
	public void verifyCampaignTest() throws Throwable{
		
	//open the browser and enter the URL and click on go button and verify login page
	
	//Login to Application and verify Home page
	
	ValidLoginTest vl=new ValidLoginTest();
	vl.loginToApp();
	
	
	// click on campaign module
	HomePage hp=new HomePage();
	hp.clickOnCamapaignLink();
	
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	Filelib flib=new Filelib();
	wlib.verify(wlib.getpageTitle(), flib.getpropData(PROP_PATH,"customViewTilte"), "Custom View Page");
	
	// Click on New Campaign Button
	DisplayCustomViewPage dcp=new DisplayCustomViewPage();
	dcp.clickOnNewCampaignBtn();
	wlib.verify(wlib.getPageTitle(), "createCompaignTitle","Create Compaign Page");
	
	CreateCampaignPage cc=new CreateCampaignPage();
	cc.enterCampaignName("sai");
	cc.clickOnSaveBtn();
	Thread.sleep(3000);
	hp.clickOnCamapaignLink();
	Thread.sleep(3000);
	dcp.verifyCampaignCreation("sai");
	
	
}
}
package com.Amazon.pages;

import com.Amazon.genericlib.BaseTest;
import com.Amazon.genericlib.Filelib;
import com.Amazon.genericlib.WebDriverCommonLib;
import com.joramforge.pages.DisplayCustomViewPage;

public class VerifyAmazonSearch extends BaseTest{

	
	
	HomePage hp=new HomePage();
	hp.clickOnSearchBtn();
	
	
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	Filelib flib=new Filelib();
	wlib.verify(wlib.getpageTitle(), flib.getpropData(PROP_PATH,"customView"), "Amazon.in : jbl earphones");
	
	
	
	DisplayCustomView dcp=new DisplayCustomView();
	dcp.clickOnCheckBox();
	wlib.verify(wlib.getPageTitle(), "customView","Amazon.in : jbl earphones");
	
	
	
}

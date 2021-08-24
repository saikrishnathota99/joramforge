package com.joramforge.initative;

import org.testng.annotations.Listeners;

import com.joramforge.genericlib.BaseTest;
import com.joramforge.genericlib.Filelib;
import com.joramforge.genericlib.WebDriverCommonLib;


@Listeners(com.joramforge.genericlib.MyListeners.class)
public class ValidLoginTest extends BaseTest{

	
	public void loginToApp() throws Throwable {
		LoginPage lp= new LoginPage();
		Filelib fl=new Filelib();
		lp.login(fl.getpropData(PROP_PATH,"username"),fl.getpropData(PROP_PATH, "password"));
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getpageTitle(),fl.getpropData(PROP_PATH, "homeTitle") , " Home Page");
		
	}
	
}

package com.Amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.genericlib.BaseTest;

public class AmazoninPage extends BaseTest {



	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div[2]/div/div[3]/span/div[1]/span/div/div/div[3]/ul/li[2]/span/a/div/label/i")
	private WebElement checkBox;
	
	@FindBy(xpath="//a[text()=' Electronics ']") private WebElement electronics;
	
	
	public AmazoninPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getCheckBox() {
		return checkBox;
	}
	

	public WebElement getElectronics() {
		return electronics;
	}

	public void clickOnCheckBox() {
		checkBox.click();
	}
	
}

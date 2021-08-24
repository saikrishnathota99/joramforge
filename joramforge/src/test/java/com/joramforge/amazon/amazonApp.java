package com.joramforge.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("JBL earphones");
		WebElement SearchIcon = driver.findElement(By.xpath("//input[@value='Go']"));
		SearchIcon.click();
		WebElement Checkbox= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div/div[3]/span/div[1]/span/div/div/div[3]/ul/li[2]/span/a/div/label/i"));
		Checkbox.click();
		//js.executeScript("window.scrollBy(0,2000)");
		
		//WebElement Select=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/h2/a/span"));
		//Select.click();
		
		//WebElement AddCart=driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div[3]/div/a[4]/div[1]/span[2]"));
		//AddCart.click();
		//driver.quit();
		//driver.switchTo().frame(0);
		//WebElement rating=driver.findElement(By.id("acrCustomerReviewText"));
		//rating.click();
		
		WebElement electronics=driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		electronics.click();
		
		
	}
}


package com.joramforge.genericlib;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CustomReports {

	@Test
	public void runReports()
	{
		ExtentReports repo=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("./MyBeautifulReport.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("joramforge Document");
		spark.config().setReportName("Customised Beautiful Report");
		
		repo.attachReporter(spark);
		
		 ExtentTest test1=repo.createTest("Login TestCase").assignAuthor("Sai").assignCategory("Smoke Test").assignDevice("windows chrome 90");

		 test1.info("Open the Browser");
		 test1.info("Enter the test URL");
		 test1.info("Enter the UserName");
		 test1.info("Enter the Password");
		 //test1.skip("Click rem pwd checkbox");
		 test1.info("click on Login buttton");
		 test1.pass("Login successfully");
		 
		 repo.flush();
		 
		 
		 ExtentTest test2=repo.createTest("Logout TestCase").assignAuthor("Sai").assignCategory("Smoke Test").assignDevice("windows chrome 90");
		 test2.info("Open the Browser");
		 test2.info("Enter the test URL");
		 test2.info("Enter the UserName");
		 test2.info("Enter the Password");
		 test2.info("click on Login buttton");
		 test2.pass("Login successfully");
		 test2.fail("Logout Failed");
		  repo.flush();
	}
}

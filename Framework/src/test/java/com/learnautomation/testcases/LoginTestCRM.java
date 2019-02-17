package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;


public class LoginTestCRM extends BaseClass {

	@Test(priority=1)
	public void loginApp() throws InterruptedException {

		ExcelDataProvider excel = new ExcelDataProvider();
		logger = report.createTest("Login to CRM");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting Application");
		
		loginPage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		logger.pass("Login Success");
		
		Helper.captureScreenshot(driver);

	}
	
	@Test(priority=2)
	public void loginApp1() throws InterruptedException {

		logger = report.createTest("Logout");
		logger.fail("Logout failed");

	}

}

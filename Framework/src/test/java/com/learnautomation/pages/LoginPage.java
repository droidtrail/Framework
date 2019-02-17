package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	//Comentário
	public LoginPage(WebDriver ldriver) {

		this.driver = ldriver;
		

	}

	@FindBy(name = "username") WebElement uname;
	@FindBy(name = "password") WebElement pass;
	@FindBy(xpath = "//input[@value='Login']") WebElement loginButton;

	public void loginToCRM(String usernameAplication, String passwordApplication) throws InterruptedException {
		
		Thread.sleep(2000);
		uname.sendKeys(usernameAplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();
	}

}

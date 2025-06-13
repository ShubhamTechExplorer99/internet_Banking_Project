package com.internet_Banking_Project.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P_002_LoginPage extends BasePage{

	public P_002_LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	//Locators
	@FindBy(xpath = "//input[@name=\"uid\"]")
	WebElement txtUsername;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@name=\"btnLogin\"]")
	WebElement btnLogin;
	
	//Actions Methods
	
	public void enterUsername(String user) {
		txtUsername.sendKeys(user);
		
	}
	
	public void enterPassword(String pass) {
		txtPassword.sendKeys(pass);
	}
	
	public void clkOnLogin() {
		btnLogin.click();
	}
	
	

}

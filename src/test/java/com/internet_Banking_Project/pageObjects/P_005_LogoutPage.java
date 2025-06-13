package com.internet_Banking_Project.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P_005_LogoutPage extends BasePage{

	public P_005_LogoutPage(WebDriver driver) {
		super(driver);
		
	}
	
	//Locators
	
	@FindBy(xpath = "//a[normalize-space()='Log out']")
	WebElement btnLogout;
	
	//Actions methods
	
	public void clkLogoitBtn() {
		btnLogout.click();
	}
	
	

}

package com.internet_Banking_Project.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P_001_HomePageDisplayed extends BasePage {

	//Constructor
	public P_001_HomePageDisplayed(WebDriver driver) {
		super(driver);
		
	}
	
	//Locators
	@FindBy(xpath = "//div[@class=\"logo\"]")
	WebElement homePagelogo;
	
	//Actions Methods
	
	public boolean isHomePageDisplayes() {
		return homePagelogo.isDisplayed();
	}
	
	
	
	
	
	

}

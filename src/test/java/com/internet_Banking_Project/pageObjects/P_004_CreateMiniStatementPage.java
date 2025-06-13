package com.internet_Banking_Project.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P_004_CreateMiniStatementPage extends BasePage {

	public P_004_CreateMiniStatementPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//a[normalize-space()='Mini Statement']")
	WebElement btnMiniStatement;
	
	@FindBy(xpath = "//input[@name='accountno']")
	WebElement txtAccountNo;
	
	@FindBy(xpath = "//input[@name='AccSubmit']")
	WebElement btnSubmit;
	
	
	//Actions Methods
	
	public void clkOnMiniStatement() {
		btnMiniStatement.click();;
	}
	
	public void enterAccountNo() {
		txtAccountNo.sendKeys("119");
	}
	
	public void clkSubmitBtn() {
		btnSubmit.click();
	}

}

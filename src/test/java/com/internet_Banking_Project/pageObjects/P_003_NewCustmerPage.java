package com.internet_Banking_Project.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P_003_NewCustmerPage extends BasePage {

	public P_003_NewCustmerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators

	@FindBy(xpath = "//a[normalize-space()='New Customer']")
	WebElement btnNewAccount;
	
	@FindBy(xpath = "//input[@onblur=\"validatecustomername();\"]")
	WebElement txtCustmerName;
	
	@FindBy(xpath = "(//input[@name=\"rad1\"])[1]")
	WebElement btnMale;
	
	@FindBy(xpath = "//input[@name='dob']")
	WebElement txtDOF;
	
	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement txtAddress;
	
	@FindBy(xpath = "//input[@name='city']")
	WebElement txtCity;
	
	@FindBy(xpath = "//input[@name='state']")
	WebElement txtState;
	
	@FindBy(xpath = "//input[@name='pinno']")
	WebElement txtPin;
	
	@FindBy(xpath = "//input[@name=\"telephoneno\"]")
	WebElement txtMobNo;
	
	@FindBy(xpath = "//input[@name='emailid']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement btnSumit;
	
	//Actions Methods
	
	public void clkNewAccount() {
		btnNewAccount.click();
	}
	
	public void enterName() {
		txtCustmerName.sendKeys("Shubham");
	}
	
	public void selectMaleGender() {
		btnMale.click();;
	}
	
	public void enterDOF() {
		txtDOF.sendKeys("05/09/2002");
	}
	
	public void enterAddress() {
		txtAddress.sendKeys("Lakshmi Niwas");
	}
	
	public void enterCity() {
		txtCity.sendKeys("Ambajogai");
	}
	
	public void enterState() {
		txtState.sendKeys("Maharastra");
	}
	
	public void enterPin() {
		txtPin.sendKeys("431517");
	}
	
	public void enterMobNo() {
		txtMobNo.sendKeys("9421119119");
	}
	
	public void enterEmail() {
		txtEmail.sendKeys("shubham119@gmail.com");
	}
	
	public void clkSubmit() {
		btnSumit.click();;
	}
	
	
	
	
	
	
	
	

}

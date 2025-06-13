package com.internet_Banking_Projects_testCases;

import org.testng.annotations.Test;

import com.automationExercise.testCases.BaseClass;
import com.internet_Banking_Project.pageObjects.P_002_LoginPage;
import com.internet_Banking_Project.pageObjects.P_003_NewCustmerPage;

public class TC_004_NewCustmerTest extends BaseClass {
	
	@Test
	public void verifyAddNewCustmer() throws Exception {
		
		P_002_LoginPage p2= new P_002_LoginPage(driver);
		p2.enterUsername(p.getProperty("username"));
		p2.enterPassword(p.getProperty("password"));
		p2.clkOnLogin();
		Thread.sleep(1000);
		
		P_003_NewCustmerPage p3 = new P_003_NewCustmerPage(driver);
		p3.clkNewAccount();
		p3.enterName();
		p3.selectMaleGender();
		p3.enterDOF();
		p3.enterAddress();
		p3.enterCity();
		p3.enterState();
		p3.enterPin();
		p3.enterMobNo();
		p3.enterEmail();
		p3.clkSubmit();
		
		Thread.sleep(1000);
		driver.close();
		
	}
	

}

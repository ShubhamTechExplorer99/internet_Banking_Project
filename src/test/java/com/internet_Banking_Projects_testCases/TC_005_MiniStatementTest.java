package com.internet_Banking_Projects_testCases;

import org.testng.annotations.Test;

import com.automationExercise.testCases.BaseClass;
import com.internet_Banking_Project.pageObjects.P_002_LoginPage;
import com.internet_Banking_Project.pageObjects.P_004_CreateMiniStatementPage;


public class TC_005_MiniStatementTest extends BaseClass{
	
	@Test
	public void verifyMiniStatement() throws Exception {
		
		P_002_LoginPage p2 = new P_002_LoginPage(driver);
		p2.enterUsername(p.getProperty("username"));
		p2.enterPassword(p.getProperty("password"));
		p2.clkOnLogin();
		Thread.sleep(2000);
		
		P_004_CreateMiniStatementPage p4 = new P_004_CreateMiniStatementPage(driver);
		p4.clkOnMiniStatement();
		p4.enterAccountNo();
		p4.clkSubmitBtn();
		
		Thread.sleep(1000);
		driver.close();
		
		
		
		
	}

}

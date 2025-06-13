package com.internet_Banking_Projects_testCases;

import org.testng.annotations.Test;

import com.internet_Banking_Project.pageObjects.P_002_LoginPage;
import com.internet_Banking_Project.pageObjects.P_005_LogoutPage;

import baseClass.BaseClass;


public class TC_006_LogoutTest extends BaseClass {
	
	@Test
	public void verifyLogout() throws Exception {
		
		P_002_LoginPage p2 = new P_002_LoginPage(driver);
		p2.enterUsername(p.getProperty("username"));
		p2.enterPassword(p.getProperty("password"));
		p2.clkOnLogin();
		Thread.sleep(2000);
		
		P_005_LogoutPage p5 = new P_005_LogoutPage(driver);
		p5.clkLogoitBtn();
		Thread.sleep(2000);
	
		BaseClass b = new BaseClass();
		b.alertAccept(driver);
		
		driver.close();
		
		
		
		
	}

}

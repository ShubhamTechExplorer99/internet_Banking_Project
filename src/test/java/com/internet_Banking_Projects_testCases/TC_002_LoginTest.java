package com.internet_Banking_Projects_testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationExercise.testCases.BaseClass;
import com.internet_Banking_Project.pageObjects.P_002_LoginPage;

public class TC_002_LoginTest extends BaseClass {
	
	@Test
	public void verifyLoginTheApplication() throws IOException, Exception {
		
		P_002_LoginPage p2 = new P_002_LoginPage(driver);
		p2.enterUsername(p.getProperty("username"));
		p2.enterPassword(p.getProperty("password"));
		p2.clkOnLogin();
		
		Thread.sleep(3000);

		if(driver.getPageSource().contains("Log out"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen("loginTest");
			Assert.assertTrue(false);
		}
		
		Thread.sleep(1000);
		driver.close();
		
		
	}

}

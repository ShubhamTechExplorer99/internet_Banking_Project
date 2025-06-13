package com.internet_Banking_Projects_testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationExercise.testCases.BaseClass;
import com.internet_Banking_Project.pageObjects.P_001_HomePageDisplayed;

public class TC_001_HomepageDisplayedTest extends BaseClass {
	
	@Test
	public void verifyHomePageDisplayed() throws Exception {
		
		P_001_HomePageDisplayed p1 = new P_001_HomePageDisplayed(driver);
		Assert.assertTrue(p1.isHomePageDisplayes(),"Home page is displayes");
		Thread.sleep(1000);
		driver.close();
		
	}

}

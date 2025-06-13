package com.internet_Banking_Projects_testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationExercise.testCases.BaseClass;
import com.internet_Banking_Project.pageObjects.P_002_LoginPage;

public class TC_003_LoginWithDDT extends BaseClass {
	
	@Test(dataProvider = "LoginData")
	public void loginDDT(String user, String pwd) throws Exception {
		
		P_002_LoginPage p02 = new P_002_LoginPage(driver);
		p02.enterUsername(user);
		p02.enterPassword(pwd);
		p02.clkOnLogin();
		
		Thread.sleep(3000);

		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			//logger.warn("Login failed");
		}
		else
		{
			Assert.assertTrue(true);
			//logger.info("Login passed");
			p02.clkOnLogin();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();

		}
		
		Thread.sleep(1000);
		driver.close();
		
		
	}
	
	public boolean isAlertPresent() {
		
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
			
		}
		
	}
	
	@DataProvider(name = "LoginData")
	String [][] getData()throws IOException
	{
		String path = System.getProperty("user.dir")+"/src/test/resources/inetbankingData.xlsx";
		FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Sheet1");
        int rownum = sheet.getLastRowNum();
        int colcount = sheet.getRow(0).getLastCellNum();

		String logindata[][]=new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < colcount; j++) {
                Cell cell = row.getCell(j);
                logindata[i - 1][j] = (cell == null) ? "" : cell.toString();
            }
        }
        workbook.close();
        fis.close();
        return logindata;	}
	
	
	
	

}

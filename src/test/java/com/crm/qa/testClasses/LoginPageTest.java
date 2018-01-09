package com.crm.qa.testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.pages.LoginPage;
import com.crm.qa.testBase.TestBase;
import com.crm.qa.util.TestUtil;

public class LoginPageTest extends TestBase {
   String sheetName ="Data";
   
	LoginPage loginpageobject;
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginpageobject= new LoginPage();
		
	}
	
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="getCRMTestData")
	public void loginPageTest(String uName , String pWord){
		loginpageobject.login(uName,pWord);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}

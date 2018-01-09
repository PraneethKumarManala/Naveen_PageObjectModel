package com.crm.qa.testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.testBase.TestBase;

public class HomePageTest extends TestBase{

	LoginPage loginPageObject ;
	HomePage  HomePageObject;
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void SetUp(){
		initialization();
		loginPageObject = new LoginPage();
		HomePageObject = new HomePage();

	}
	/*@Test(priority=1)
	public void loginToCRM(){
		loginPageObject.login(prop.getProperty("username"), prop.getProperty("password"));
	}*/

	@Test()
	public void clickonNewContactLink(){
		loginPageObject.login(prop.getProperty("username"), prop.getProperty("password"));
		HomePageObject.moveToContactLink();
		
	}
	/*@AfterMethod
	public void tearDown(){
		driver.quit();
	}*/
}

package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.testBase.TestBase;

public class LoginPage extends TestBase{

	
	//PageFactory or ObjectRepository
	@FindBy(name="username")
	@CacheLookup
	WebElement userName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement passWord;
	
	@FindBy(xpath="//input[@type='submit']")
	@CacheLookup
	WebElement submitButton ;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPage(){
    return driver.getTitle();
	}
	
	public void login(String UName , String PWord){
		userName.sendKeys(UName);
		passWord.sendKeys(PWord);
		submitButton.click();
	}


	
}

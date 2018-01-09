package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.testBase.TestBase;

public class HomePage extends  TestBase{

	
	
	@FindBy(xpath="//a[text()='Contacts']")
	@CacheLookup
	WebElement contactsLink;
	
	@FindBy(xpath="//a[text()='New Contact']")
	@CacheLookup
	WebElement NewContactLink;
	
	
	public HomePage(){
      PageFactory.initElements(driver, this);
   
	}
	
	public void moveToContactLink(){
		Actions action= new Actions(driver);
         action.moveToElement(contactsLink).build().perform();
         NewContactLink.click();
	}
	
}

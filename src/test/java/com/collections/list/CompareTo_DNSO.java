package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CompareTo_DNSO {

	@Test
	public void lounchBrowser() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	/*List<WebElement> list = driver.findElements(By.id("month"));
	for(WebElement ele:list){
		System.out.println(ele.getAttribute("innerHTML"));
		if(ele.getAttribute("innerHTML").contains("Apr")){
			ele.click();
			break;
		}
	}*/
	
	//Select select = new Select(driver.findElement(By.id("month")));
	/*List<WebElement> options = select.getOptions();
	System.out.println(options.size());
	for(int i=0;i<options.size();i++){
		System.out.println(options.get(i).getText());
		if(options.get(i).getText().equalsIgnoreCase("Mar")){
			options.get(i).click();
		}
	}*/
	
	/*Select select = new Select(driver.findElement(By.id("month")));
	select.selectByVisibleText("Mar");*/
	
	/*List<WebElement> list = driver.findElements(By.id("month"));
	for(int i=0;i<list.size();i++){
   	 System.out.println(list.get(i).getText());
   	 if(list.get(i).getText().equalsIgnoreCase("Apr")){
   		 list.get(i).click();
   		 
   	 }
	}*/
	
	 List<WebElement> list = driver.findElements(By.id("month"));
	 ArrayList a= new ArrayList();
	Iterator<WebElement> itr = list.iterator();
	while(itr.hasNext()){
	 a.add(itr.next().getText());
	 if(itr.next().equals("Mar")){
		 itr.next().click();
		 
	 }
	}
	System.out.println(a);
  /* for(WebElement totallist : list){
	   if(totallist.getText().equalsIgnoreCase("Mar")){
		   Thread.sleep(2000);
		   totallist.click();
	   }*/
   }

}

package com.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GeckoDriver {
	@Test
	public void lounchBrowser(){
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://google.co.in");
    //driver.manage().window().maximize();

	}
}

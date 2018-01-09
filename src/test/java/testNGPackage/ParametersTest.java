package testNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

	WebDriver driver;
	@Test
	@Parameters("Browser")
	public void test1(String Browser1){
		
		if(Browser1.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(Browser1.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get("http://google.co.in");
		
	}
}

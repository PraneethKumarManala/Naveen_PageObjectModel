package testNGPackage;

import org.testng.annotations.Test;

public class EnablesDisabled {

	
	@Test(enabled = true , description="I am login with valid data")
	public void test1(){
		System.out.println("Test is enabled");
	}
	
	@Test(enabled = false , description="I am login with Invalid data")
	public void test2(){
		System.out.println("Test is disabled");
	}
}

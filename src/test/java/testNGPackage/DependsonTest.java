package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonTest {



	@Test()
	public void test1(){
		System.out.println("Test1");
		Assert.assertTrue(true);
	}
	@Test(dependsOnMethods={"test1", "test3"})
	public void test2(){
		System.out.println("Test2");
	}
	@Test()
	public void test3(){
		System.out.println("Test3");
		Assert.assertTrue(false);
	}
}

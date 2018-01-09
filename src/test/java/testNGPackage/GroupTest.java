package testNGPackage;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups ={"Sanity" , "Regression"})
	public void test1(){
		System.out.println("Test1");
	}
	@Test(groups={"Sanity"})
	public void test2(){
		System.out.println("Test2");
	}
	@Test(groups={"Regression"})
	public void test3(){
		System.out.println("Test3");
	}
	@Test
	public void test4(){
		System.out.println("Test4");
	}
	
}

package testNGPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	

    @DataProvider(name = "TestData")
	public Object[][] dataproviderTest(){
		
		Object[][] obj = new Object[2][2];
		obj[0][0] ="Praneeth";
		obj[0][1] ="Bindu";
		
		obj[1][0] ="Praneeth1";
		obj[1][1] ="Bindu1";
		
		return obj;
	}
    
    @Test(dataProvider="TestData")
    public void testLogin(String userName , String Password){
    
    	System.out.println(userName+"_"+Password );
    }
}

package testNg;

import org.testng.annotations.Test;

public class DataProviderpratices {

	@Test(dataProvider="getdata")
	
	public void dataProviderDemo(String name,int Price) //capture data from data provider
	
	{
		System.out.println("Phone is ->"+name+"and proce is"+price);
	}
	
	public Object[][] getdata()
	{
		Object[][] data = new Object[3][2];
	}
	
	
	
	
}

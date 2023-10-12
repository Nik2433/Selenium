package testNg;

import org.testng.annotations.Test;

public class Testngclass {

	@Test (priority = 1)
	
	 public void CreateUser()
	 
	 
	 {
		System.out.println("User Created");
	 }
	@Test (priority = 1)
	public void ModifyUser()
	{
		System.out.println("User Modified");
	}
	
	@Test (priority = 0)
	
	public void DeleteUser()
	{
		System.out.println("User deleted");
	}
	
}

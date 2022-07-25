package CrossbrowserTesting;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HRMLogin {
	
	@BeforeTest
	public void setup()
	{
		System.out.println("precondition.....");
		
	}

	@AfterTest
	public void teardown()
	{
		System.out.println("post condition....");

	}

	@Test(priority = 1)
	public void loginTest()
	{
		System.out.println("login test.....");

	}
	
	@Test(priority = 4)
	public void logoutTest()
	{
		System.out.println("..logout test...");
	}
	@Test(priority = 2)
	public void payment()
	{
		System.out.println("payment test");
	}
	
	@Test(priority = 3)
	public void cancleOrder()
	{
		System.out.println("Cancel order Test....");
	}
	
	@Test(priority = -2)
	public void serchproduct()
	{
		System.out.println("search product test");
	}
}

package basicTest;

import org.junit.Assert;
import org.junit.Test;

//import junit.framework.Assert;

public class LoginTest {

	
	@Test
	public void logintest()
	{
		System.out.println("login test");
		String expected="selenium";
		String actual="selenium";
		Assert.assertEquals(expected, actual);
		System.out.println("assert is done");
	}
	
	@Test
	public void containsmethod()
	{
		String expected="demo";
		String Actual="https://opensource-demo.orangehrmlive.com/";
		expected.contains(Actual);
		System.out.println("contains is executed");
	}
	
	@Test
	public void logouttest()
	{
		System.out.println("logout test");
	}
	
}

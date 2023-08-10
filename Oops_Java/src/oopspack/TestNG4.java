package oopspack;

import org.testng.annotations.*;

public class TestNG4 {
	
	@Test(enabled = true)
	public void a()
	{
		System.out.println("we r in a method");
	}

	@Test(enabled = false)
	public void b()
	{
		System.out.println("we r in b method");
	}
	
	@Test(invocationCount = 2) 
	public void c()
	{
		System.out.println("we r in c method");
	}
	
	//@Test (priority = -1)
	public void d()
	{
		System.out.println("we r in d method");
	}
	
	@Test (priority = 2)
	public void e()
	{
		System.out.println("we r in e method");
	}

}

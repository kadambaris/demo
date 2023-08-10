package oopspack;

import org.testng.annotations.Test;

public class Test3 {

	@Test(priority = 1)
	public void a()
	{
		System.out.println("we r in a method");
	}

	@Test (priority = 0)
	public void b()
	{
		System.out.println("we r in b method");
	}
	
	@Test
	public void c()
	{
		System.out.println("we r in c method");
	}
	
	@Test (priority = -1)
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

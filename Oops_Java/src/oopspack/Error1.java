package oopspack;

import org.testng.Assert;

public class Error1 {

	public static void main(String[] args) {
		
		String a = "Hi";
		String b = "Hello";
		
		try
		{
			Assert.assertEquals(a, b);
		}catch (Error e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Assertion handled");
	}
}

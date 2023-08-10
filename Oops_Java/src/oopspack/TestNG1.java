package oopspack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@AfterMethod
	public void aam()
	{
		System.out.println("we r in the AfterMethod");
	}
	
	@AfterClass
	public void bac()
	{
		System.out.println("we r in the AfterClass");
	}
	
	@Test
	public void ct()
	{
		System.out.println("we r in the TESTNG");
	}
	
	@BeforeSuite
	public void dbs() {
	System.out.println("i m in d @BeforeSuite");
	}	
	
	@AfterSuite
	public void eas()
	{
		System.out.println("we r in the @AfterSuite");
	}
	
	@BeforeTest
	public void fbt()
	{
		System.out.println("we r in the @BeforeTest");
	}
	
	@BeforeClass
	public void gbc()
	{
		System.out.println("we r in the @BeforClass");
	}
	
	@BeforeMethod
	public void hbm()
	{
		System.out.println("we r in the @BeforeMethod");
	}
	
	@AfterTest
	public void iat()
	{
		System.out.println("we r in the @AfterTest");
	}
}

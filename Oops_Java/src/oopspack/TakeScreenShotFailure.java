package oopspack;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.*;


public class TakeScreenShotFailure {
	
	TakeScreenShotFailure t1 = new TakeScreenShotFailure ();

	WebDriver driver;
	
	public void captureSS(ITestResult result) throws Exception
	{
		TakesScreenshot tsc = (TakesScreenshot) driver;
		if(ITestResult.FAILURE==result.getStatus())
				{
									
					File srFile = tsc.getScreenshotAs(OutputType.FILE);
					
					//FileUtils.copyFile(srFile, new File("./screenshot"+result.getName()+".png"));
					FileHandler.copy(srFile, new File ("./screenshot"+result.getName()+".png"));
					System.out.println(result.getName() + "method() screenshot captured");
					Thread.sleep(3000);
				}
	}
	
	@Test
	public void doLogin()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Kadambari_office\\Eclipse\\8-6-2023\\Oops_Java\\Install\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.facebook.com");
		driver.findElement(By.id("email_id")).sendKeys("abcd@gmail.com");
	}
	
	@AfterMethod
	
	public void takeScreenshot(ITestResult result2) throws Exception
	{
		t1.captureSS(result2);
	}
}

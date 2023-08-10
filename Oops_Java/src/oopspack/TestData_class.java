package oopspack;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class TestData_class {

	WebDriver driver;
	
	@BeforeClass
	public void stEnv()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Kadambari_office\\Eclipse\\8-6-2023\\Oops_Java\\Install\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
	}
	
	@DataProvider
	public Object[][] dataset()
	{
		File src = new File("");
		return null;
	}

	
}

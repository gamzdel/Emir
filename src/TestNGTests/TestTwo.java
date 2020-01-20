package TestNGTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Master_Listener.class)
public class TestTwo
{
	@BeforeGroups(groups= {"Regression"})
	public void beforgroup()
	{
		System.out.println("#####Before groups execution after a particular group");
	}
	
	@AfterGroups(groups= {"Regression"})
	public void aftergroup()
	{
		System.out.println("#####After groups execution after a particular group");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("$$$$$Before Test execution before all tests");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("$$$$$After Test execution after all tests");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("!!!!!Before class execution Before the testng class");
	}
	
	@AfterClass
	public void aftercalss()
	{
		System.out.println("!!!!After Class execution after individual testNG class");
	}
	
	//will execute before eaach test case gets executed
	@BeforeMethod
	public void beforemethod()
	{
		 System.out.println("----Before method execution before each test case");
	}
  
	//is used for creating the test cases
  @Test(groups = {"Regression"})
  public void Tc_001() throws MalformedURLException 
  {
  System.out.println("This is testcase one in TestTwo class");
  URL u = new URL("http://172.20.10.4:4444/wd/hub");
	
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	
	WebDriver driver = new RemoteWebDriver(u, cap); 
	
	driver.get("https://www.linkedin.com");
  
  }
  
  @Test(groups = {"Smoke"})
  public void Tc_002() 
  {
	  System.out.println("This is testcase two in TestTwo class");
 }
  
  @Test(groups = {"Smoke"})
  public void Tc_003() 
  {
 	  System.out.println("This is testcase three in TestTwo class");
 }
  
  @Test(groups = {"Regression"})
  public void Tc_004() 
  {
	  System.out.println("This is testcase four in TestTwo class");
  }
  
  //this annotation gets executed after every individual test are executed
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("-----Aftermethod is executed after ever test case");
 }
  
}

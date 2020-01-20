package TestNGTests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import PageObject.HomePage;
import Utility.locatorUtility;

public class login {

	public static void main(String[] args) throws IOException
	{
		URL u = new URL("http://172.20.10.4:4444/wd/hub");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(u, cap); 
				//locatorUtility.driverSetup("RWD", "http://newtours.demoaut.com/mercurywelcome.php");
		
				
		//driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		//identify userID.. using a reusable method from page classes
		
		/*
		HomePage.username_text(driver, "name", "userName");
		HomePage.userID.sendKeys("hello");
		*/
		
		HomePage hpo =new  HomePage(driver);
		
		hpo.userID_EnterText("lankesh123", "name" , "userName");
		
		locatorUtility.captureImage(driver,"afteruserID");
		//identify password.. using a reusable method from page classes
		/*HomePage.pwd_text(driver, "name", "password");
		HomePage.pwd.sendKeys("Hello");
	*/
		
		hpo.pwd_enterText("lankesh123", "name", "password");
		locatorUtility.captureImage(driver,"afterpwd");
		
		
	}

}

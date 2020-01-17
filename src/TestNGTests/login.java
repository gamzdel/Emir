package TestNGTests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.locatorUtility;

public class login {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = locatorUtility.driverSetup("firefox", "http://newtours.demoaut.com/mercurywelcome.php");
		
				
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

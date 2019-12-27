package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverFeatures {

	public static void main(String[] args) 
	{
	WebDriver driver = new FirefoxDriver();
		
		//get method is used to launch a particular url
		driver.get("https://www.facebook.com");
		
		System.out.println("Current url " +driver.getCurrentUrl());
		
		String ExpectedTitle = "Facebook home";
		
		String ActualTitle = driver.getTitle();
		
		if(ExpectedTitle.equals(ActualTitle))			
			System.out.println("Title matches " + driver.getTitle());	
		else
			System.out.println("Title doesnot match " + driver.getTitle());
		
		System.out.println("ID of the window " + driver.getWindowHandle());
		
		System.out.println("Cookies " + driver.manage().getCookies());
		
		driver.get("https://www.google.co.in");
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		driver.navigate().to("https://www.flipkart.com");
		
		driver.manage().window().fullscreen();
		System.out.println("position of window " + driver.manage().window().getPosition());
		
		
	}

}

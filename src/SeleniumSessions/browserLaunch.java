package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserLaunch {

	public static void main(String[] args) 
	{
		//System properties
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		
		//Launching of chrome browser
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://www.linkedin.com");
		 
		EdgeDriver driver = new EdgeDriver();
		
		String ExpectedpageTitle = "Linkedin Login";
		String ActualpageTitle = chrome.getTitle();
		
		if(ExpectedpageTitle.equals(ActualpageTitle))
			System.out.println("Title matches " + ActualpageTitle);
		else
			System.out.println("Title does not match " + ActualpageTitle);
		
		
		//identify the element signin and then perform click action
		WebElement signin = chrome.findElement(By.className("nav__button-secondary"));
		signin.click();
		
		//identify the userid textboa and theen enter the iserid
		WebElement userID = chrome.findElement(By.name("session_key"));
		userID.sendKeys("lankeshzone@gmail.com");
		
		//identify the password textbox and then enter the password
		WebElement pwd = chrome.findElement(By.id("password"));
		pwd.sendKeys("lankesh123");
		
		
		//identify login button and perform click action
		WebElement login = chrome.findElement(By.className("btn__primary--large"));
		login.click();
		
		String expectedErrorMessage = "Invalid Password";
		
		WebElement errorMessage = chrome.findElement(By.id("error-for-password"));
		String actualErrorMessage = errorMessage.getText();
		
		if(actualErrorMessage.equals(expectedErrorMessage))
			System.out.println("Test passes " + actualErrorMessage);
		else
			System.out.println("Test Fails " + actualErrorMessage);
		
	/*	FirefoxDriver firefox = new FirefoxDriver();
		firefox.get("https://www.linkedin.com");
		
		
		InternetExplorerDriver ie = new InternetExplorerDriver();
		ie.get("https://www.facebook.com");
	*/
		
		
	}

}

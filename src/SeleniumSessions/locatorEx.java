package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class locatorEx 
{
	//id/name/classname/tagname/linktext/partiallinktext - properties
	//xpath/csspath - DOM definition
	
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	
		//locator id
		WebElement userID;
		userID = driver.findElement(By.id("username"));
		
		System.out.println("location for ID property element " + userID.getLocation());
		
		//locator name
		WebElement pwd;
		pwd = driver.findElement(By.name("session_password"));
	
		System.out.println("location for name property element " + pwd.getLocation());
		
		
		//locator classname
		WebElement signIN;
		signIN = driver.findElement(By.className("btn__primary--large"));
		
		System.out.println("location for classname property element " + signIN.getLocation());
		
		//locator TagName
		WebElement input;
		input = driver.findElement(By.tagName("h1"));
		System.out.println("location for Tag property element " + input.getLocation());
		
		//locator linktext
		WebElement forgot;
		forgot = driver.findElement(By.linkText("Forgot password?"));
		System.out.println("location for linktext property element " + forgot.getLocation());
		
		//locator partial
		WebElement join;
		join = driver.findElement(By.partialLinkText("Join"));
		System.out.println("location for partial property element " + join.getLocation());
		
		//locator CSS
		WebElement show;
		show = driver.findElement(By.cssSelector("#password-visibility-toggle"));
		System.out.println("location for CSS property element " + show.getLocation());
		
		//locator xpath
		WebElement user;
		user = driver.findElement(By.xpath("//a[contains(text(),'User Agreement')]"));
		System.out.println("location for xpath property element " + user.getLocation());
		
		
	}
	
	
	
}

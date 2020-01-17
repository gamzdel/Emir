package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	static WebDriver driver;
	static WebElement userID, pwd, signON;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public static void username_text( String locatorType, String locatorValue)
	{
		userID = driver.findElement(locatorUtility.setlocator(locatorType,locatorValue));
	}
	
	public void userID_EnterText(String text, String locatorType, String locatorValue)
	{
		username_text(locatorType, locatorValue);
		userID.sendKeys(text);
	}
	
	
	
	public static void pwd_text( String locatorType, String locatorValue)
	{
		pwd = driver.findElement(locatorUtility.setlocator(locatorType,locatorValue));
	}
	
	public void pwd_enterText(String text, String locatorType, String locatorValue)
	{
		pwd_text(locatorType, locatorValue);
		pwd.sendKeys(text);
	}
	
	
	
	
}

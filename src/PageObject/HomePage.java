package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	static WebElement userID, pwd, signON;
	
	public static void username_text(WebDriver driver, String locatorType, String locatorValue)
	{
		userID = driver.findElement(By.name(locatorValue));
	}
	
	public static void pwd_text(WebDriver driver, String locatorType, String locatorValue)
	{
		pwd = driver.findElement(By.name("password"));
	}
	
}

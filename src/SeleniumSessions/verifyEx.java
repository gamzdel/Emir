package SeleniumSessions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class verifyEx {

	public static void main(String[] args) throws Exception
	{
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.linkedin.com");
		
		String ExpectedTitle = "LinkedIn Home";
		
		String ActualTitle = driver.getTitle();
		
		if(ExpectedTitle.equals(ActualTitle))
			System.out.println("Title matches");
		else
			System.out.println("Title doesnot match");
		
		WebElement signin = driver.findElement(By.className("nav__button-secondary"));
		
		//signin.getAttribute("font-size");
		
		Dimension ActualSize = signin.getSize();
		
		Dimension ExpectedSize = new Dimension(20,30);
		
		Assert.assertEquals(ActualSize, ExpectedSize);
		
		//if(ActualSize.equals(ExpectedSize))
			
		
		
		if (signin.isEnabled())
			signin.click();
		else
			throw new Exception("button not enabled");
		
		String ExpectedURL = "https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin";
		
		
		WebElement header = driver.findElement(By.tagName("h1"));
		String ActualMessage = header.getText();
		String ExpectedMessage = "Welecome linkedin";
		
		if(ExpectedMessage.equals(ActualMessage))
			System.out.println("Message matches");
		else
			System.out.println("Message doesnot match");	
		
		
		//Hard Assert
		/*Assert.assertEquals(actual, expected);
		Assert.assertNotEquals(actual1, actual2);
		Assert.fail();
		Assert.assertTrue(condition);
		Assert.assertNull(object);
		
		//softAssert
		SoftAssert s = new SoftAssert();
	
		*/
		//if(assert.assertEquals(ActualMessage, ExpectedMessage));
		
		
		
		
		System.out.println("Test continues");
		
	}

}
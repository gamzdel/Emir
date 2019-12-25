package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webElementEx {

	public static void main(String[] args) throws InterruptedException 
	{
	
		//Launch the browser
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		//identify the element
		WebElement userIDTextBox;
		
		userIDTextBox = driver.findElement(By.id("username"));
		
		System.out.println(userIDTextBox.getAttribute("aria-describedby"));
		
		System.out.println(userIDTextBox.getCssValue("font-family"));
		
		System.out.println(userIDTextBox.getTagName());
		
		
		System.out.println(userIDTextBox.getLocation());
		
		System.out.println(userIDTextBox.getSize());
		
		System.out.println(userIDTextBox.isDisplayed());
		System.out.println(userIDTextBox.isEnabled());
		System.out.println(userIDTextBox.isSelected());
		
		userIDTextBox.sendKeys("lankeshzone@gmail.com");
		
		Thread.sleep(3000);
		
		userIDTextBox.clear();
		
		WebElement forgot = driver.findElement(By.linkText("Forgot password?"));
		System.out.println(forgot.getText());
		
		
		WebElement signIN = driver.findElement(By.className("btn__primary--large"));
		signIN.submit();
		
		
		List<WebElement> input = driver.findElements(By.xpath("//input"));
		
		System.out.println("List size " + input.size());
		
		for(WebElement e : input)
			System.out.println("Element " + e.isDisplayed());
		
		
	}

}

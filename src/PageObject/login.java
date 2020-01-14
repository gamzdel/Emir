package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		//identify userID.. using a reusable method from page classes
		HomePage.username_text(driver, "name", "userName");
		HomePage.userID.sendKeys("hello");
		
		
		//identify password.. using a reusable method from page classes
		HomePage.pwd_text(driver, "name", "password");
		HomePage.pwd.sendKeys("Hello");

	}

}

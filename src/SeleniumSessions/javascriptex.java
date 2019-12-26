package SeleniumSessions;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javascriptex {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("document.getElementById('username').value='lankesh';");
		
		//js.executeAsyncScript("document.getElementById('username').value='Emir';");
		
		List<Object> s = (List<Object>) js.executeScript("return document.getElementsByTagName('input');");
		System.out.println(" bgcolor " + s.size());
	}
}
package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws MalformedURLException
	{
	
		//Launch of browser
		WebDriver driver = new ChromeDriver();
		
		//opening a particular URL
		driver.get("https://www.linkedin.com");
		
		driver.get("https://www.google.co.in");
		
		//navigation interface
		driver.navigate().back(); // takes you back by one page
		
		driver.navigate().forward(); // takes toy forward by one page
		
		driver.navigate().refresh(); //refreshing current active page
		
		//loading page through string parameter
		driver.navigate().to("https://www.amazon.in");
		
		//Loading a page through url parameter
		URL url = new URL("https://www.flipkart.com");
		driver.navigate().to(url);
		
		
		//Options interface
		
		Set<Cookie> s = driver.manage().getCookies();
		
		System.out.println("cookies are "+s.size()+ " test " + s);
		
		
		driver.get("https://www.linkedin.com");
				
		//TimeOuts interface
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.className("nav__button-secondary")).click();
		System.out.println("hellooo");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		
		//applicable for executing during the javascript methods
		//driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollBy(0,1000);");
		
		//shutting the browser
		//driver.close(); // will close the current active tab/window
		driver.quit(); //will shut the browser
		
	}
	

}

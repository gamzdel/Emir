package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws MalformedURLException, InterruptedException
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
		//driver.quit(); //will shut the browser
	
		
		//Windows
		driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();
		
		// return the current position of the window
		System.out.println("Before" + driver.manage().window().getPosition()); 
		
		//returns the size of the window
		System.out.println("Before" + driver.manage().window().getSize());
		
		Point p = new Point(100,100);
		driver.manage().window().setPosition(p);
		
		Dimension d = new Dimension(700,300);
		driver.manage().window().setSize(d);
		
		// return the current position of the window
		System.out.println("After " +driver.manage().window().getPosition()); 
		
		//returns the size of the window
		System.out.println("After " +driver.manage().window().getSize());
		
		
		driver.manage().window().maximize();
		//TargetLocator - working with alerts/frames/windows
		//alerts
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//click on a button to generate the alert
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		//switching the focus of selenium to alert window.
		Alert a = driver.switchTo().alert();
		
		//allowing the program to sleep for 5 seconds
		Thread.sleep(5000);
		
		//accepting the alert by clicking on Okay..
		a.accept();
		
		
		//WebDriver base methods
		//returns the current url of the page
		System.out.println(driver.getCurrentUrl()); 

		//return the current page title
		System.out.println(driver.getTitle());
		
		//returns the selnium window-id for the active window
		System.out.println(driver.getWindowHandle());
	
		
		//returns the selnium window-id(s) for the active window
		System.out.println(driver.getWindowHandles());
		
		//returns the current source of the driver
		System.out.println(driver.getPageSource());
		
		
	}
	

}

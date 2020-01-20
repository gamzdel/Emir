package Utility;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class locatorUtility 
{

	public static By setlocator(String locatorType, String locatorValue)
	{
		By locator = null;
		
		switch(locatorType)
		{
			case "id":
				locator = By.id(locatorValue);
				break;
			case "name":
				locator = By.name(locatorValue);
				break;
			case "class":
				locator = By.className(locatorValue);
				break;
			case "tag":
				locator = By.tagName(locatorValue);
				break;
			case "xpath":
				locator = By.xpath(locatorValue);
				break;
			case "css":
				locator = By.cssSelector(locatorValue);
				break;
			case "link":
				locator = By.linkText(locatorValue);
				break;
			case "partial":
				locator = By.partialLinkText(locatorValue);
				break;

		}
		
		
		return locator;
	}
	
	public static WebDriver driverSetup(String browser, String url) throws MalformedURLException
	{
		WebDriver driver;
		
		switch(browser)
		{
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			break;
		case "RWD":
			URL ur = new URL("http://172.20.10.4:4444/wd/hub");
			System.out.println("using Remote WebDriver");
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(ur,cap);
			break;
		default:
			driver = new FirefoxDriver();
			break;
		}
		driver.get(url);
		
		return driver;
	}
	
	public static void captureImage(WebDriver driver,String str) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		//getscreen shot method to capture image and assign to file
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Snapshot\\"+str +".jpg"));
	}
	
}

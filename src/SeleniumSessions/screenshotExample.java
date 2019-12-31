package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshotExample {

	public static void main(String[] args) throws IOException, InterruptedException
	{
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		
		//instance of takesscreenshot
		//parent type == child reference type
		TakesScreenshot ts = (TakesScreenshot)driver;
		//getscreen shot method to capture image and assign to file
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Snapshot\\test1.jpg"));
	
		
		driver.get("https://www.linkedin.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500);");
		
		File f2 = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f2, new File("D:\\Snapshot\\test2.jpg"));
		
		Dimension d = new Dimension(200,200);
		
		driver.get("https://www.google.co.in");
		WebElement x = driver.findElement(By.name("q"));
		x.sendKeys("Hello Kunal");
		Thread.sleep(7000);
		
		File f4 = x.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f4, new File("D:\\Snapshot\\test4.jpg"));
		
		  
		driver.manage().window().setSize(d);
		Thread.sleep(6000);
		File f3 = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f3, new File("D:\\Snapshot\\test3.jpg"));
		
	}

}

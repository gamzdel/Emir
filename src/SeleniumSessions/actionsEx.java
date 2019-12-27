package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionsEx
{

	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000);");
		
		WebElement slider = driver.findElement(By.className("ui-slider-handle"));
		
		//creating an object of actions class
		Actions act = new Actions(driver);
		
	//	act.dragAndDropBy(slider, 60, 0).build().perform();
		
		
		Action a = act.moveToElement(slider).dragAndDropBy(slider, 100,0).build();
		
		a.perform();
		
		
		// entering a text on a text field
		a = act.sendKeys(driver.findElement(By.id("search_query_top")),"Hello").build();
		a.perform();
		
		
		//rightclick on current mouse location
		//act.contextClick().build().perform();
		
		
	}
	
	
}

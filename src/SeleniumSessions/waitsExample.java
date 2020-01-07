package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitsExample {

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver = new ChromeDriver();
		
		//we are setting page load time for 2 seconds 
		driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");
		
		
		//script time out for asynchronous mode scripts
	//	driver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeAsyncScript("window.scrollBy(0,500);");
		
		
		//Java programming wait to suspend the execution of the program
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		//js.executeAsyncScript("window.scrollBy(0,500);");
		
		//driver.navigate().to("https://www.timesofindia.com");
		
		*/
		driver.navigate().refresh();
		/*WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sign-in-form__password-visibility-toggle")));
		WebElement show = driver.findElement(By.className("sign-in-form__password-visibility-toggle"));
		System.out.println(show.getLocation());
		*/
		FluentWait ft = new FluentWait(driver).pollingEvery(2, TimeUnit.SECONDS);
		
		ft.until(ExpectedConditions.presenceOfElementLocated(By.className("sign-in-form__password-visibility-toggle")));
		WebElement show2 = driver.findElement(By.className("sign-in-form__password-visibility-toggle"));
		System.out.println(show2.getLocation());
		
		System.out.println("after the wait");
		
	}

}

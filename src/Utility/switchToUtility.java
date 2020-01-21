package Utility;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToUtility {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		//driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	
		Alert a = driver.switchTo().alert();
		
		//return the message on the alert box
		System.out.println(a.getText());
		
		//click on okay
		//a.accept();
		
		//click on cancel or X
		a.dismiss();
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		a = driver.switchTo().alert();
		
		System.out.println("in second alert" + a.getText());
		
		a.sendKeys("Test for sending the text");
		a.accept();
	
		
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("Hello");
		
		
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		System.out.println("Before  click " + driver.getTitle());
		
		driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		
		Set<String> s = driver.getWindowHandles();
	
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			driver.switchTo().window(i.next().toString());
			if(driver.getTitle().contentEquals("Sakinalium | Home"))
				driver.findElement(By.xpath("//*[@id=\"container\"]/header/div/div/div[2]/ul/li[4]/a")).click();
		}
		System.out.println("After click " + driver.getTitle());
	}
	
	

}

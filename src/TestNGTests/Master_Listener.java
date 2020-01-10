package TestNGTests;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Master_Listener extends TestListenerAdapter
{

	//Invoked after all the tests have run and all their Configuration methods have been called.
	public void onFinish(ITestContext testContext)
	{
		//1) capture a screenshot
		//2) report an event (method, class, starting , ending..)
		//3) Log the information
		//4) event information finetuning of scripts
		//5) tester
		
	System.out.println("triggerend when all the tests have finished execution");	
	}

	public void	onStart(ITestContext testContext)
	{
		System.out.println("triggerend before all the tests have started execution");	
			
	}
	
	public void	onTestFailedButWithinSuccessPercentage(ITestResult tr)
	{
		System.out.println("triggerend when tests fail but with in certain percentage");	
			
	}
	
	public void	onTestFailure(ITestResult tr)
	{
		System.out.println("triggerend when a particular tests fails execution");	
		
	}
	
	public void	onTestSkipped(ITestResult tr)
	{
		System.out.println("triggerend when a particular tests is skipped execution");	
		
	}
	
	public void	onTestStart(ITestResult result)
	{
		System.out.println("triggerend when a particular tests starts execution");	
		
	}
	
	
	public void	onTestSuccess(ITestResult tr)
	{
		System.out.println("triggerend when a particular tests passed execution");	
		
	}
		
}

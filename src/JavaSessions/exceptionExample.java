package JavaSessions;

import java.io.IOException;

public class exceptionExample 
{
	
	//Arrays
	// size was 3.. but i was accessing 4th or 5th element... indexOutrange of exception
	
	
	public static void main(String[] args) throws ArithmeticException, IOException
	{
		int[] x = new int[2];
		int i=3;
		
		String str = "Emir2";
		
		
		
		if (str.equals("Emir"))
			throw new ArithmeticException("because str is emir i wannu stop here");
			
		
		
		//when there is no exception try executes completely
		try
		{
		x[0]= 100;
		x[1]= 200;
		x[3]= 300;
		
		System.out.println("Iam array with size two ");
		}
		///whenever exception occurs catch will execute
		catch(ArrayIndexOutOfBoundsException e)
		{
			i=0;
			System.out.println("catch executes when exception occurs " + e.getMessage());
		}
		//finally is used to write code which has to be executed irrespective of exception occurence
		finally
		{
			// statements associated to this block
			for (int ii=0;ii<x.length;ii++)
				System.out.println("Array value" + x[ii]);
		}
		
		System.out.println("program continuation");
		
		throw new IOException("iam not happy");
		
		
	}
		
	
}

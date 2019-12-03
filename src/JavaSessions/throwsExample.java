package JavaSessions;

import java.io.File;

public class throwsExample 
{

	
	//throws part is applicable for checked exception only...
	public static void main(String[] args) throws Exception
	{
	int x = 11;
	
	if(x>20)
		throw new ArithmeticException("X is greatern than so not acceptable");
	
	int[] xx=new int[2];
	try
	{
	xx[10]=100;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e.getMessage() + ""  );
		e.printStackTrace();
	}
	File f = new File("segdfhdfgdg");
	
	f.createNewFile();

	System.out.println("Hello");
	}

}

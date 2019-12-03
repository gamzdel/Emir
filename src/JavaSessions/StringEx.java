package JavaSessions;

public class StringEx 
{

	public static void main(String[] args)
	{
		String code = "ITx345";
		
		boolean valid1 = false;
		boolean valid2 = false;
		boolean valid3 = false;
		//condition No. 1
		if ((code.charAt(0) == 'i') || (code.charAt(0) == 'I'))
			valid1 = true;
		else
			valid1 = false;
		
		//condition No. 1
		if ((code.charAt(1) == 't') || (code.charAt(1) == 'T'))
			valid2 = true;
		else
			valid2 = false;
		
		byte[] x = new byte[4];
		code.getBytes(2, 5, x, 0);
		
		for( int i=0; i<=3; i++)
		{
			System.out.println(x[i]);
			if(x[i]>0 || x[i]<9)
				valid3 = true;
			else
				valid3 = false;
			
			if(valid3 == false)
				break;
		}
		
		if(valid1 == true && valid2 == true && valid3 == true)
			System.out.println("Its a valid code");
		else
			System.out.println("It is  not a valid code");
		
	}
	
	
	
}

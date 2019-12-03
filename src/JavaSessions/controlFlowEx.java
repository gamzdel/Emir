package JavaSessions;

public class controlFlowEx 
{

	public static void main(String[] args) 
	{
	
		
		//if condition
		
		int age = 10;
		
		if(age<=18)
		{
			System.out.println("He is a kid " + age);
		}
		
		
		age = 20;
		//if - else 
		
		if(age<=18)
		{
			System.out.println("He is a kid " + age);
		}
		else
		{
			System.out.println("He is an adult " + age);
		}
		
		
		// for - loop
		
		int x = 1;
		
		for (x=1; x<=10; x++)
		{
			int table = 5*x;
			System.out.println("Table of 5 * " + x + " = " + table);
		}
		
		
		//for-each loop
		char[] weekdays = {'M','T','W','T','F','S','S'};
		
		for(char day : weekdays)
		{
			System.out.println("This is " + day);
		}
	
		
		//while loop
		
		age = 10;
		
		while(age<=18)
		{
			System.out.println("He is not eligible to vote " + age);
			age++;
		}
		
	
		x = 10;
		//do-while loop
		do
		{
			int discount = x * 2;
			System.out.println("Discount is " + discount);
			x++;
		}
		while (x<=15);
		
		
		
		//switch statements
		char person = 'S';
		
		switch (person) 
		{
			case 'L':
				System.out.println("This is Lankesh");
				break;
			case 'E':
				System.out.println("This is Emir");
				break;
			case 'P':
				System.out.println("This is Peter");
				break;
			default:
				System.out.println("This is Default");
				break;
		}
		
	}

}

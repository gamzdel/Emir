package JavaSessions;

class controlFlow 
{
	{
		System.out.println("Iam first instance block");
	}
	
	//static and instance variable 
	static int x = 20;
	int y = 40;
	
	public static void main(String[] args)
	{
		x = 500;
		System.out.println("Iam main method " + x);
		controlFlow.methodstatic();
		controlFlow c = new controlFlow();
		controlFlow c2 = new controlFlow();
		controlFlow c3 = new controlFlow();
		c.methodinstance();
	}

	//constructor
	public controlFlow()
	{
		System.out.println("This is the constructor");
	}
	
	static
	{
		x = 200;
		System.out.println("this is the first block of static " + x);
	}
	
	static
	{
		x = 100;
		System.out.println("value of x before assigning " + x);
	}
	
	static //static block
	{
		int z = 300;
		System.out.println("Iam third static block");
		z = 400;
	}
	
	
	{  //instance block
		System.out.println("Iam second instance block" );
	}
	
	//static method created here
	public static void methodstatic()
	{
		System.out.println("Iam static method");
	}
	
	//instance method created here
	public void methodinstance()
	{
		System.out.println("Iam instance method");
	}
	
}

package JavaSessions;

public class Test12
{
		
	
	//static members can only be accessed through class
	static int x = 100;
	
	public static void main(String[] args)
	{
		Test12 Test = new Test12();

		Test.x =200;
		Test.methodOne();
	}

	static void methodOne()
	{
		System.out.println("Iam static method "  );
	}
	

}

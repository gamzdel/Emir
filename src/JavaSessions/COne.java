package JavaSessions;

public class COne extends parent
{

	public static void main(String[] args) 
	{
		COne c1 = new COne(); // object of child class
		c1.parentmethod(); // member from parent class
		c1.c1method(); // member from its own class
		
	}

	public void c1method()
	{
		System.out.println("iam a method in child one");
	}
	
}

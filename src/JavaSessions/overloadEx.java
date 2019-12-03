package JavaSessions;

public class overloadEx
{
	public static void main(String[] args)
	{
		overloadEx o1 = new overloadEx();
		o1.addition(10, 10);
		o1.addition(10,20.5f);
		o1.addition(100, 200, 300);
	}

	//overloaded methods
	//case-1 when two integers are added
	public void addition(int n1, int n2)
	{
		int sum = n1 +n2;
		System.out.println("Addition of two integers " + sum);
	}
	
	//overloaded methods
	//case-2 when one integer and one float is added
	public void addition(int n1, float n2)
	{
		float sum = n1 + n2;
		System.out.println("Addition of one int and one float numbers " + sum);
	}
	
	//overloaded methods
	//case-3 when three integers are added
	public void addition(int n1, int n2, int n3)
	{
		int sum = n1 + n2 +n3;
		System.out.println("Addition of three integers " + sum);
	}
	
	//overriden method
	public void operation(int n1, int n2)
	{
		int operation = n1 + n2;
		System.out.println(" YOu wanted operation from parent class " + operation);
	}
	
}

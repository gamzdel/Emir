package JavaSessions;

public class child extends abstractEx
{

	public static void main(String[] args)
	{
		child c1 = new child();
		c1.calculatefee(100, 20, 30);
	}

	public int calculatefee(int af, int tf, int sf)
	{
		int fee = tf + sf+af;
		return fee;
	}
	
	child()
	{
		//super();
	}
	
	
}


//child class should implement all abstract method from parent to become a normal class..
//if we refrain from implementing one or more abstract methods then the child is abstract class...

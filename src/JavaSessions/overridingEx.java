package JavaSessions;

public class overridingEx extends overloadEx
{

	public static void main(String[] args) 
	{
		// Object Type = reference type
		//classname objectname = new constructor()
		
		overridingEx o1 = new overridingEx();
		o1.operation(100, 100); // multiplication?
		
		
		//parent  == Parent
		overloadEx o2 = new overloadEx();
		o2.operation(100, 100); // addition
		
		//parent == child reference (in this situation the o3 can have n number of possibilities)
		overloadEx o3 = new overridingEx();
		o3.operation(100, 100);
		
		o3 = new overloadEx();
		o3.operation(20, 20);
		
		
	}

	
	//overriding method..
	public void operation(int n1, int n2)
	{
		int operation = n1 * n2;
		System.out.println("You are accessing child class operation method " + operation);
	}
}

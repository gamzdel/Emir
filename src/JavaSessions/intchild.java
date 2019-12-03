package JavaSessions;

public class intchild implements intOne, inttwo
{
	public void methodOne()
	{
		System.out.println("Iam methd one implemented in child class");
	}

	public void methodTwo()
	{
		System.out.println("Iam methd two implemented in child class");
	}
	
	public void methodThree()
	{
		System.out.println("Iam methd three implemented in child class");
	}
	
	public static void main(String[] args)
	{
		intchild i1 = new intchild();
		i1.methodOne();
		i1.methodTwo();
		i1.methodThree();
		//intone ==> interface
		// intchild(i1) ==> object of implemented class
		i1.methodTwo();
	}
}

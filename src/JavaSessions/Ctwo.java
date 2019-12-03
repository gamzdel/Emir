package JavaSessions;

public class Ctwo extends parent
{

	public static void main(String[] args)
	{
		Ctwo c2 = new Ctwo(); // object of child class
		c2.parentmethod(); // method from parent class
		c2.ctwomethod(); //method from child class
		
	}
	
	public void ctwomethod()
	{
		System.out.println("Iam child Two method");
	}

}

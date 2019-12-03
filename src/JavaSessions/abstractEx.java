package JavaSessions;

//if you have one or more methods as abstract then the class should be abstract as well

public abstract class abstractEx 
{

	public static void main(String[] args) 
	{
		//cannot create an object of abstract class
		//abstractEx a1 = new abstractEx();
		
	}

	//compiler doesnt showup any problem
	public abstractEx()
	{
		System.out.println("Iam constructor of abstract class");
	}
	
	//abstract method here
	abstract public int calculatefee(int af, int tf, int sf);
	
	
}

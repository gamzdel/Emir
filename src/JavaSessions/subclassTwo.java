package JavaSessions;

public final class subclassTwo extends COne
{

	public static void main(String[] args) 
	{
		subclassTwo sc2 = new subclassTwo(); //object of parent class
		sc2.parentmethod(); // method from super parent
		sc2.c1method(); //method parent
		sc2.subclassTwomethod(); //self method	
	}

	public void subclassTwomethod()
	{
		System.out.println("Iam subclass two method");
	}
	
	
}

package JavaSessions;

public class anotherClassinPackage {

	public static void main(String[] args)
	{
	
		
		modifierEx m = new modifierEx();
		
		System.out.println("public type " + m.a);
		//System.out.println("private type " + m.b); //private variable not availble outside the class
		System.out.println("protected type " + m.c);
		System.out.println("Default type " + m.d);
		
	}

}

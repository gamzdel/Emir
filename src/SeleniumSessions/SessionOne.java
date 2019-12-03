package SeleniumSessions;

import JavaSessions.modifierEx;

public class SessionOne
{

	public static void main(String[] args)
	{
		modifierEx m = new modifierEx();
		
		System.out.println("public type " + m.a);
	//	System.out.println("private type " + m.b); // private variable
		//System.out.println("protected type " + m.c); // protected outside the package but not a subclass
		//System.out.println("Default type " + m.d); //default outside the package
	}
	
}

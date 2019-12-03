package JavaSessions;

public class modifierEx 
{
	
	//public variable
	public int a = 100;
	
	//private
	
	private int b= 200;
	
	//protected
	protected int c = 300;
	
	//default
	int d = 400;
	

	public static void main(String[] args) 
	{
	
		modifierEx m = new modifierEx();
		
		System.out.println("public type " + m.a);
		System.out.println("private type " + m.b);
		System.out.println("protected type " + m.c);
		System.out.println("Default type " + m.d);
	}

}

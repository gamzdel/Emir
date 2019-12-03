package JavaSessions;

public class subclassOne extends COne
{

	public static void main(String[] args) 
	{
		subclassOne sc1 = new subclassOne(); // object of subclass
		sc1.parentmethod(); // super parent method
		sc1.c1method(); // parent method
		sc1.subclassOnemethod(); // self class method
	}
	
	public void subclassOnemethod()
	{
		System.out.println("Iam subclass methodone");
	}
	
	
	
}

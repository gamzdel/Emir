package JavaSessions;

public class subsubclassOne extends subclassOne
{

	public static void main(String[] args) 
	{
		subsubclassOne ssc1 = new subsubclassOne(); // object of subsubclass 
		ssc1.parentmethod(); //super parent 
		ssc1.c1method(); //level 1 method
		ssc1.subclassOnemethod(); //immediate parent method
		ssc1.ssclassmethod(); //self class method
	}
	
	public void ssclassmethod()
	{
		System.out.println("Iam method from sub sub class");
	}

}

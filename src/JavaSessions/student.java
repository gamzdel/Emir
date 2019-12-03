package JavaSessions;

public class student
{
	//data members of the class
	int roll;
	String name;
	
	//Since department is under the control of class we define this as static
	static String Dept;
	
	
	//method
	public void calc_fee(int tf, int sf, int af)
	{
		int fees = tf + sf +af;
		System.out.println( "Student fees is " + fees);
	}
	
	
	
	public static void main(String[] args)
	{
		
		//classname <name> = new constructor();
		student emir = new student();  //creating an object of type student 
		
		//initializing the member data
		emir.roll = 1;
		emir.name ="Emir K";
		
		//assigning static member value
		student.Dept ="AI";
		
		//using the member to print values
		System.out.println("Roll No. " + emir.roll);
		System.out.println("Name " + emir.name);
		System.out.println("Dept of Emir " + student.Dept);
		
		//calling the instance method for object
		emir.calc_fee(100, 20, 10);
		
		
		student lankesh = new student(); //lankesh object creation
		
		student peter = new student(); //peter object
		
	
	}

}

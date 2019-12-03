package JavaSessions;

public class studentConstructorEx 
{	public studentConstructorEx()
	{
		University = "NewYork University"; // string
	}
	
	
	public static void main(String[] args)  //string
	{
	
		studentConstructorEx emir = new studentConstructorEx();
		System.out.println("Emir is in " +emir.University);

		studentConstructorEx lankesh = new studentConstructorEx("Delhi University");
		System.out.println("Lankesh is in " + lankesh.University);	
		
	}
	

	studentConstructorEx(String str)
	{
		University = str;
	}
	int roll;
	String name;
	String Dept;
	static String University = "Bangalore University";
	
	

}

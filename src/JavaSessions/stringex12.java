package JavaSessions;

public class stringex12 {

	public static void main(String[] args) 
	{
		
		// creating a string using objects
		String str1 = new String("Lankesh"); // create two objects one in SCP one in Java heap memory
		
		
		// creating an string using literals
		String str2 = "Lankesh"; // create one object that if the it does not find the same data
		
		System.out.println(str1.charAt(3));
		
		System.out.println(str1.concat("Gowda"));
		
		System.out.println(str1.substring(2));
		
		System.out.println(str1.substring(3,5));
		
		System.out.println(str1.equals("Gowda"));
		
		System.out.println(str1.contains("esh"));
		
		
		System.out.println(str1.isEmpty());
		System.out.println(str1.length());
		
		System.out.println(str1.toUpperCase()); //LANKESH
		
		System.out.println(str1); //Lankesh
		
		System.out.println(str1.toLowerCase());
		
		
		

	}

}

package JavaSessions;

public class stringBuilderExample {
	
	public static void main(String[] args)
	{
		
		StringBuilder str = new StringBuilder("Emir");
		
		//str.append(" USA");
		
		//System.out.println(str);
		
		//str.insert(8, " tree");
		char[] str2 = {'r','a','i','n','b','o','w'};
		
		//str.insert(4, str2, 3, 2);
		
		str.append(str2, 0, 5);
		
		//lankesh ==> lank123esh (insert)
		//lankesh ==> lankeshIndia (append)/insert
		
		System.out.println(str);
		
		System.out.println(str.length());
		
		str.deleteCharAt(4);
		System.out.println(str);
		
		str.reverse();
		
		System.out.println(str);
		
		StringBuffer str1 = new StringBuffer("Lankesh");
		
		
	}

}

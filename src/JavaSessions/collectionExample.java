package JavaSessions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class collectionExample {

	public static void main(String[] args) 
	{	
		collectionExample c = new collectionExample();
	
		ArrayList<Object> a = new ArrayList<Object>();
		
		HashSet<Object> hs = new HashSet<Object>();
		//ArrayList<Object> b = new ArrayList<Integer>();
		
		
		
		a.add(100); //integer
		a.add('c'); // character
		a.add(new collectionExample()); // object of type class -collectionExample
		a.add("Lankesh"); //String
		a.add(2.54f); //float
		a.add(13.435456); // Double
		a.add(true); //Boolean
		a.add(c);
		
		Iterator i = a.iterator(); // iterator method will return the looping values
		
		while(i.hasNext())
			System.out.println("individual elements" + i.next());
		
		
		for ( int x=0; x<a.size(); x++)
			System.out.println("using get method and for loop " + a.get(x));
		
		
		System.out.println("Using the sop of arraylist " + a);
		
		ArrayList<Object> b = new ArrayList<Object>();
		b.add(25);
		b.add("Rajeev");
		b.add(false);
		
		a.addAll(b);
		
		System.out.println("Using the sop of arraylist " + a);
		
		a.removeAll(b);
		
		System.out.println("Using the sop of arraylist " + a);
		
		a.remove(2);
		a.remove("Lankesh");
		System.out.println("Using the sop of arraylist " + a);
		
		System.out.println("Check for Lankesh element " + a.contains("Lankesh"));
		
		a.addAll(b);
		
		System.out.println("Check for another collection " + a.containsAll(b));
		
		System.out.println("Index of value c " + a.indexOf('c'));
		
		System.out.println("collection is empty or not " + a.isEmpty());
		
		System.out.println("current size " + a.size());
		
		a.clear();
		
		System.out.println("current size after clear method " + a.size());

		a.addAll(a);
		System.out.println("current size after adding the empty collection-a " + a.size());
		
		a.addAll(b);
		System.out.println("current size after adding the b " + a.size());
		
		
		System.out.println("returning mutiple strings using arraylist" + arraylistreturn());
		
		
		/*
		collectionExample o = (collectionExample) a.get(2);
		
		o.test();
		*/
		//ArrayList<Integer> x = new ArrayList<Integer>();
		
	}

	public void test()
	{
		System.out.println("This is method in class");
	}
	
	public static ArrayList<String> arraylistreturn()
	{
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Lankesh");
		a.add("Vipin");
		
		return a;
	}
	
}

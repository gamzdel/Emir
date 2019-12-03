package JavaSessions;

import java.util.Arrays;

public class arraysExample 
{

	public static void main(String[] a)
	{
		// declare array here
		int[] x = new int[3];
		
		x[0]= 45;
		x[1]= 200;
		x[2]= 23;
		
		x[3]= 100;
		System.out.println("Size will be " + x.length);
		
		// the last element of the array is always size-1 
		// the first element is always zero
		System.out.println("value of 3rd element " + x[2]);
		
		System.out.println("index of value 100 in array x is : "+Arrays.binarySearch(x, 0, 2, 300));
		
		//Arrays.sort(x);
		
		for(int i=0;i<x.length;i++)
			System.out.println("array value " + x[i]);
		
		
	}
	
}

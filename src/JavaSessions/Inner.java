package JavaSessions;

public class Inner {

	public static void main(String[] args)
	{
	
	}

	public void m1()
	{
		System.out.println("Hello One");
	}
	
	
	public class inner2
	{
		public void m2()
		{
			Inner i = new Inner();
			i.m1();
			
			inner2 i2 = i.new inner2();
			i2.m2();
			System.out.println("Hello Two");
		}
	}
	
	public class inner3
	{
		public void m3()
		{
			System.out.println("Hello Three");
		}
	}
}

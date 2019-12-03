package JavaSessions;

public class TestClass {

	public int x = 100;
	private int y = 200;
	protected int z = 300;
	int a = 400;
	
	public static void main(String[] args)
	{
		TestClass t1 = new TestClass();
		System.out.println("Public " + t1.x);
		System.out.println("Private " + t1.y);
		System.out.println("Protected " + t1.z);
		System.out.println("Default " + t1.a);
	}
	

}

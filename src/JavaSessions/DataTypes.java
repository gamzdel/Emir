package JavaSessions;

class DataTypes
{ 	int x;

	public static void main(String[] args) 
	{
	   	//Byte (whole numbers 1 byte)
	   byte b = 10;

	   		//short(Whole numbers 2 bytes)
	   	short s = 100; 

	   		//int (Whole numbers 4 bytes)
	  
	   	
	   		//float (Decimal numbers 8 bytes)
	   	float f = 2.34f;

	   		//long (wholeumbers 16 byteS)
	   	long l = 2353534;

	   		//double(decimal 32 bytes)
	   	double d = 22334.456;

	   //	--> NIn-numerical
	   		//boolean ==> True/false
	   	boolean bl = true;  

	   		//character ==> char (1/2 bytes - undefined )
	   	char c = 'x';
	   	DataTypes d2 = new DataTypes();
	   	

	   	
	   	System.out.println("Byte " + b);
	   	System.out.println("short " + s);
	   	System.out.println("int " + d2.x);
	   	System.out.println("long " + l);
	   	System.out.println("float " + f);
	   	System.out.println("Double " + d);
	   	System.out.println("char " + c);
	   	System.out.println("Boolean " + bl);
	   	checkBalance(100,20,30);
	   	
	}

	public static void checkBalance(int pb, int exp, int infl)
	{
		int balance = pb + infl - exp;
		System.out.println("inside method Balance would be " + balance );
	}
	
}

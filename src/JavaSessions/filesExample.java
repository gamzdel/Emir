package JavaSessions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filesExample {

	public static void main(String[] args) throws IOException
	{
	//Create the file object...
		
		File f = new File("D://Test//EmirOne.txt");
		
		
		if(f.exists())
			System.out.println("File already exists");
		else
		{
			f.createNewFile();
			System.out.println("File created");
		}
		
		String str = "This is Emirs first file created using streams in Java";
		
		byte[] b = str.getBytes();
		
		FileOutputStream fos = new FileOutputStream(f);
		
		fos.write(b);
		fos.flush();
		
		FileInputStream fis = new FileInputStream(f);
		
		byte[] x = fis.readAllBytes();
		
		
		for(int j=0;j<b.length;j++)
			System.out.print((char)x[j]);
		
		System.out.println("number of bytes in file " + fis.available());
		
		System.out.println("Can execute? " + f.canExecute());
		
		System.out.println("Absolute path = " +f.getAbsolutePath());
		
		System.out.println("Name is " + f.getName());
	
		FileWriter fw = new FileWriter(f);
		
		fw.write("This is Swathi's first text file in java.");
		fw.flush();
		
		fw.append("Testing for append operation");
		fw.flush();
		
		FileReader fr = new FileReader(f);
		
		System.out.println("Single character " + (char)fr.read());
		
		//fr.reset();
		
		char[] c = new char[100];
		int z = fr.read(c);
		
		for(int i=0; i<z;i++)
			System.out.print(c[i]);
		
		
	}

}

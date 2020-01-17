package JavaSessions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class CompareText
{
    public static void main(String args[]) throws Exception
    {

        String valSource;
        String valDest;

        File file1 = new File("D:\\DB_Framework\\Text\\TextOne.txt");
        Scanner source = new Scanner(file1); 

        File file2 = new File("D:\\DB_Framework\\Text\\TextTwo.txt");
        Scanner dest = new Scanner(file2);  

        while(source.hasNextLine())
        {
                   
            while(dest.hasNextLine())
            {
            	valSource=source.next();
                 
                valDest=dest.next();
               
                if(valDest.equals(valSource)) 
                	System.out.println(valDest);
                else
                {	System.out.println("else: " + valDest);
                
	                try
	                {
	                    FileWriter writer=new FileWriter("D:\\DB_Framework\\Text\\Result.txt");
	                    writer.append(valSource + " " + valDest);
	                    writer.flush();
	                    writer.close();
	                }
	                catch(IOException e)
	                {
	                    e.printStackTrace();
	                }
                }	
            }
        }
    }
}
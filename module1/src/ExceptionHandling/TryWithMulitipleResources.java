package ExceptionHandling;
import java.io.*;

public class TryWithMulitipleResources {

	public static void main(String[] args) 
	{
	  try(FileWriter fw=new FileWriter("D://9abc.txt"))
       {
		  String s="i am pratik";
		  fw.write(s);
		  System.out.print("success");
		  
		
	   }
	   catch(Exception e )
	  {
		   System.out.println(e);
		   
		   
	  }

	}

}

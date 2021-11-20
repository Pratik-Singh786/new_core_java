package ExceptionHandling;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Eh9
{

	public static void main(String[] args) 
	{
		PrintWriter pw;
		try
		{
			pw=new PrintWriter("jtp.txt");
			pw.println("saved");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("file sucessfully saved");
		
		

	}

}

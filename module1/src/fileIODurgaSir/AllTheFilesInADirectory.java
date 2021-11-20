package fileIODurgaSir;
import java.io.*;
public class AllTheFilesInADirectory 
{

	public static void main(String[] args) throws IOException
	
	{
		int count=0;
		File f=new File("D://dbms");
		String[] s=f.list();
		for(String s1:s)
		{
			count++;
			System.out.println(s);
		}
		System.out.println("the total number of file are: "+count);
		
		

	}

}

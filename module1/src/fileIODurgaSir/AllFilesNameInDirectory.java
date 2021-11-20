package fileIODurgaSir;
import java.io.*;
public class AllFilesNameInDirectory {

	public static void main(String[] args)  throws IOException
	{
		int count=0;
		File f=new File("D://dbms");
		String[] s=f.list();
		for(String s1:s)
		{
			File f1=new File(f,s1);
			if(f1.isFile())
			{
			  count++;
			  System.out.println(s);
			}
		}
		System.out.println("the total number of file are: "+count);
		
		

	}

}

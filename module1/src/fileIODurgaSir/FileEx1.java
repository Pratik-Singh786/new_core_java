package fileIODurgaSir;
import java.io.*;

public class FileEx1 {

	public static void main(String[] args) throws IOException
	{
		File f=new File("pratik");// File is also used to create directories 
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		//cons:-
		File f1=new File( "pratik"); // name of the file or directory
		File f2=new File("D", "pratik"); //subdir ,file or directory present in subdir
		File f3=new File( "pratik","pk"); //File Subdir and String name
		

	}

}

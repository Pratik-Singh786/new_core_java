package fileIODurgaSir;
import java.io.*;
public class ImportantMethodsOfFileClass
{    
	public static void main(String[] args) throws IOException
	{
		File f=new File("D://javaIo/fileEx.txt");
		System.out.println(f.exists());//it will check the file is present or not
		System.out.println(f.createNewFile());//if the file not present already it will create a new file and return false
		f.mkdir();//to make directory
		System.out.println(f.isFile()); //return true if the physical file is present
		System.out.println(f.isDirectory());//return true if  f is pointing to a directory
		System.out.println(f.list());// String list() return all files and sub-directories present in the specified directory
		System.out.println(f.length()); //return the number of character present in the specified file.
	    f.delete();//to delete the specified file.
		
		
		
	}
}
package fileIODurgaSir;
import java.io.*;
public class FileEx {

	public static void main(String[] args)  throws IOException
	{
		File f=new File("D://javaIO/abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.print(f.exists());
		

	}

}

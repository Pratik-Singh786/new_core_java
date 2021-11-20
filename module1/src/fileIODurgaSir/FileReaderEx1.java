package fileIODurgaSir;
import java.io.*;
public class FileReaderEx1 {

	public static void main(String[] args)  throws IOException
	{
		File f=new File("D://javaIO/abc.txt");
		char [] ch=new char[(int)f.length()];
		FileReader fr=new FileReader(f);
		fr.read(ch);
		for(char ch1:ch)
		{
			System.out.print(ch1);
		}
		

	}

}

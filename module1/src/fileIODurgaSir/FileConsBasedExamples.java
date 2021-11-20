package fileIODurgaSir;
import java.io.*;
public class FileConsBasedExamples {

	public static void main(String[] args)  throws IOException
	{
		File f=new File( "abc.txt");  // create a file abc.txt in current directory
        File f1=new File("durga123","demo.txt");// directory name :-durga123 and filename demo.txt
        
        File f2=new File("D://javaIO/def.txt");
        f2.createNewFile();
        System.out.println(f2.exists());
        
	}

}

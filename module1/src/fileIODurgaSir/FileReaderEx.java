package fileIODurgaSir;
import java.io.*;
public class FileReaderEx {

	public static void main(String[] args)  throws IOException
	{
		//FileReader fr=new FileReader("String fileName");//cons1 
		//FileReader fr1=new FileReader("File f");// cons 2
		FileReader fr2=new FileReader("D://javaIO/abc.txt");
		int i;
		while((i =fr2.read())!=-1)
		{
			 System.out.print((char)i);  //we can read data character by character  so it is not convenient to the programmer
			//i=fr2.read();//to overcome this we should go for BufferedReader and BufferedWriter
		}
		//=========Important methods  of 
		//int read()
		// int read( char[] ch)
		//void close()
		

	}

}

package fileIONeptel;
import java.io.*;
public class WritingBytesintoFile {

	public static void main(String[] args) throws IOException
	{
		
     byte cities[]= {'d','e','l','h','i','\n','m','a','d','r','a','s'};
     FileOutputStream os=new FileOutputStream("D:\\javaFileInOut\\b.txt");
     os.write(cities);
     os.close();
	}

}

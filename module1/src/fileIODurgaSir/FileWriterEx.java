package fileIODurgaSir;
import java.io.*;
public class FileWriterEx {

	public static void main(String[] args)  throws IOException
	{
		FileWriter fw=new FileWriter("D://javaIO/file2.txt");
		fw.write(100);// D
		fw.write("pratik\n software solutions");
		fw.write('\n');
		char [] ch1= {'a','b','c','d'};
		fw.write(ch1);
		fw.write('\n');// Main problem with is we have to insert line separator manually
		fw.flush();
		fw.close();
		System.out.println("success");
		FileWriter fw1=new FileWriter("D://javaIO/abc.txt",true);//constructor FileWriter(String file name,boolean append) 
		
		

	}

}

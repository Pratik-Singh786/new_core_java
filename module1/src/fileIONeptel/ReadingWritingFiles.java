package fileIONeptel;
import java.io.*;
public class ReadingWritingFiles {

	public static void main(String[] args)  throws IOException
	{
		
		File infile=new File("D:\\testin.txt");
		File outfile=new File("D:\\testout.txt");
		FileReader ins=new FileReader(infile);
		FileWriter outs=new FileWriter(outfile);
		
		int ch;
		while((ch=ins.read())!=-1)
		{
			System.out.print((char)ch);
		}
		String s1="Welcome to my world";
		byte []b=s1.getBytes();
		ins.close();
		outs.close();
		
		
		

	}

}

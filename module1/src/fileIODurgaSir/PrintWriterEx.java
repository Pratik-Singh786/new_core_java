package fileIODurgaSir;
import java.io.*;
public class PrintWriterEx
{    //the main advantage of PrintWriter over FileWriter and BufferedWriter is we can write any primitive data to the file
	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("D://javaIO/fw.txt");
		PrintWriter pw=new PrintWriter(fw);
		pw.write(100);//corresponding char will be printed
		pw.println(100); //but in case of println 100 will be directly added to the file.
		pw.println(true);
		pw.println('c');
		pw.write("durga");
		pw.flush();
		pw.close();
		
	}
}
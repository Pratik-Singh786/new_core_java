package fileIODurgaSir;
import java.io.*;
public class FileMergerLineBylineAlternatively
{

	public static void main(String[] args)  throws IOException
	{
		PrintWriter pw=new PrintWriter("D://javaIO/file3.txt");//bestWriter
		BufferedReader br=new BufferedReader(new FileReader("D://javaIO/file1.txt"));//best reader
		BufferedReader br1=new BufferedReader(new FileReader("D://javaIO/file2.txt"));
		String line1=br.readLine();
		String line2=br1.readLine();
		while(line1!=null ||line2!=null)
		{
			if(line1!=null)
			{
				pw.println(line1);
				line1=br.readLine();
			}
			if(line2!=null)
			{
				pw.println(line2);
				line2=br1.readLine();
			}
		}
		
		pw.close();
		br.close();
		br1.close();
		System.out.println("Success");

	}

}

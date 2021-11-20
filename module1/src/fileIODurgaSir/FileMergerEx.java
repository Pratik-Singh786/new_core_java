package fileIODurgaSir;
import java.io.*;
public class FileMergerEx {

	public static void main(String[] args)  throws IOException
	{
		PrintWriter pw=new PrintWriter("D://javaIO/file3.txt");//bestWriter
		BufferedReader br=new BufferedReader(new FileReader("D://javaIO/file1.txt"));//best reader
		String line=br.readLine();
		while(line!=null)
		{
			pw.println(line);
			line=br.readLine();
		}
		BufferedReader br1=new BufferedReader(new FileReader("D://javaIO/file2.txt"));
		line=br1.readLine();
		while(line!=null)
		{
			pw.println(line);
			line=br1.readLine();
			
		}
		pw.close();
		br.close();
		br.close();
		System.out.println("Success");

	}

}

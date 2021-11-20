package  fileIODurgaSir;
import java.io.*;
public class ExtractionOfDataFromTwoFiles
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter pw=new PrintWriter("D://javaIO/output.txt");
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		String line=br.readLine();
		
		
	}
	
}
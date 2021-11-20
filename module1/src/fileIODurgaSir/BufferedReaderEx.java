package fileIODurgaSir;

import java.io.*;

public class BufferedReaderEx {

	public static void main(String[] args)  throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("D://javaIO/def.txt")); // advantage reading line by line instead of char by char
		String line=br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line =br.readLine();
		}
		br.close();

	}

}

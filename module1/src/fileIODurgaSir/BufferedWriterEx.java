package fileIODurgaSir;

import java.io.*;

public class BufferedWriterEx {

	public static void main(String[] args)  throws IOException
	{
		 BufferedWriter bw=new BufferedWriter(new FileWriter("D://javaIO/def.txt"));//BufferedWriter can't communicate directly with the file 
		                                                                            //they can communicate via some object
		 bw.write(100); 
		 bw.newLine();
		 char [] ch1= {'a','b','c','d'};
		 bw.write(ch1);
		 bw.newLine();
		 bw.write("pratik is very hardworking,smart and kind student with great technical skills");
		 bw.newLine();
		 bw.write("software Solutions");
		 bw.flush();
		 bw.close();
		 System.out.println("success");
		 

	}

}

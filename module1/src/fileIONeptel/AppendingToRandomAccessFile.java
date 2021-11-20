package fileIONeptel;
import java.io.*;
public class AppendingToRandomAccessFile {

	public static void main(String[] args) throws IOException
	{
		RandomAccessFile rf=new  RandomAccessFile("D:\\testin.txt","rw");
        rf.seek(rf.length());// go to the end
        rf.writeBytes("Mumbai\n");// append MUMBAI
        rf.close();
	}

}

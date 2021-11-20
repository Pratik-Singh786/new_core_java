package oops;
import java.io.*;
import java.text.DateFormat;

public class WaysToCreateObject 
{

	public static void main(String[] args)  throws Exception
	{
		//1. using new operator
		WaysToCreateObject wc=new WaysToCreateObject();
		
		//2.By using newInstance()
		//WaysToCreateObject wc1=(WaysToCreateObject)Class.forName("WaysToCreateObject").newInstance();
        
		//3.By using Factory Method
		 Runtime r=Runtime.getRuntime();
		 DateFormat df=DateFormat.getInstance();
		 
		 //4.by using clone method
		 WaysToCreateObject w=new WaysToCreateObject();
		 WaysToCreateObject w1=(WaysToCreateObject)w.clone();
		 
		 //5.By using Deserialisation
		 FileInputStream fis=new FileInputStream("D://javaIO/abc.txt");
		 ObjectInputStream ois=new ObjectInputStream(fis);
		 Dog d2=(Dog)ois.readObject();
	}

}

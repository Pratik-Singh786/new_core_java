package staticimport;

import static java.lang.System.out;

public class ImportSystemOut {

	public static void main(String[] args) 
	{
		out.println("hello");//System is a class present in the java.util.pack,
		                    //out is static variable present in the system class of the type print
		                   //println present in the print stream class 
		out.println("hi");

	}

}

package ExceptionHandling;

import java.io.IOException;

class M1
{
	void mymethod1()throws IOException
	{
		throw new IOException("device error");
		//System.out.println("device operation performed");
	}
}
public class ThrowsKeyword4 {

	public static void main(String[] args) throws IOException
	{
		M1 m1=new M1();
		m1.mymethod1();
		
		System.out.println("normal flow");


	}

}

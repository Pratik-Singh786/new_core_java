package ExceptionHandling;
import java.io.*;
class M
{
	void mymethod()throws IOException
	{
		System.out.println("device operation performed");
	}
}
public class ThrowsKeyword3 
{

	public static void main(String[] args)  throws IOException
	{
		
		M m=new M();
		m.mymethod();
		System.out.println("normal flow");

	}

}

package overriding;
import java.io.*;

class Parent10
{
	public void mymethod20()  throws IOException  
	{
		System.out.println("Exception checking through overriding1");
	}
}
class Child10 extends Parent10   
{
	public void mymethod20()  //1.should be same as parent 2.or child exception of the parent

	{
		System.out.println("Exception  checking through overriding2");
	}
}

public class OverridingWrtExcption {

	public static void main(String[] args) 
	{
		Child10 ch10=new Child10();
		ch10.mymethod20();

	}

}

package multithreading;
class MyThread4 extends Thread
{
	// if we are not overriding  the run() we are misusing the concept of overriding because thread class run() is empty
}

public class DefiningThreadCase4 {

	public static void main(String[] args) 
	{
		MyThread4  m4=new MyThread4 ();
		m4.start(); // no output to display
	}

}

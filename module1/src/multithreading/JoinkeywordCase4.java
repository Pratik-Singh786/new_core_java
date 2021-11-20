package multithreading;
import java.io.*;
public class JoinkeywordCase4 {

	public static void main(String[] args) throws InterruptedException
	{
		Thread.currentThread().join();   //its like deadlock condition and Thread have to wait until the infinite time

	}

}

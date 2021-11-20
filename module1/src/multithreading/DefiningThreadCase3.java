package multithreading;
class Mythread2 extends Thread   //overloading of run()
{
	public void run()
	{
		System.out.println("no arg mehthod");
	}
	public void run(int i)
	{
		System.out.println("int arg method");
	}
}
public class DefiningThreadCase3 {

	public static void main(String[] args)  //overloading of run()
	{
		Mythread2 t2=new Mythread2();
		t2.start();   // it will always execute no argument method
		

	}

}

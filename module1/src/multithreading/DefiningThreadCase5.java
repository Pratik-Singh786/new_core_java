package multithreading;
 class Mythread5 extends Thread
 {
	 public void  start()
	 {
		 System.out.println("start method");
	 }
	 public void run()
	 {
		 System.out.println("thread method");
	 }
 }
public class DefiningThreadCase5 {

	public static void main(String[] args) 
	{
		Mythread5 m5=new Mythread5();
		
				m5.start();  //not recommended to override start() otherwise we don't get  multithreading concept
				System.out.println("main method");

	}

}

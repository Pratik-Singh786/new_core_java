package multithreadingEnhancement;

public class ThreadLocalMethods {

	public static void main(String[] args)
	{
		ThreadLocal tl=new ThreadLocal(); //it will create a thread local variable
		System.out.println(tl.get());// it is by default because initial value is null
		tl.set("pratik");
		System.out.println(tl.get()) ;// Pratik
		tl.remove();
		System.out.println(tl.get());//null
	}

}

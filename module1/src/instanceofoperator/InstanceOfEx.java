package instanceofoperator;

public class InstanceOfEx {

	public static void main(String[] args) 
	{
		Thread t=new Thread();
		System.out.println(t instanceof Runnable);
		System.out.println(t instanceof Object);

	}

}

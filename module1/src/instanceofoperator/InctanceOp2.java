package instanceofoperator;

public class InctanceOp2 {

	public static void main(String[] args)
	{
		Thread t = new Thread();
		//System.out.println(t instanceof String);
		System.out.println(null instanceof Thread);
		System.out.println(null instanceof Object);
		System.out.println(null instanceof Runnable);

	}

}

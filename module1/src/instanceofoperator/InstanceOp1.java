package instanceofoperator;

public class InstanceOp1 
{

	public static void main(String[] args)
	{
		Thread t= new Thread();
		System.out.println(t instanceof Thread);// instance of operator is used to check 
                                               //whether the object is particular type or not
		System.out.println(t instanceof Object);
		System.out.println(t instanceof Runnable);
		
	}
}

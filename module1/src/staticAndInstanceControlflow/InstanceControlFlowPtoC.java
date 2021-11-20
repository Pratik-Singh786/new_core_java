package staticAndInstanceControlflow;
class Parent
{
	int i=10;
	{
	  m1();
	  System.out.println("parent instance block");
	}
	Parent()
	{
		System.out.println("parent constructor");
	}
	public static void main(String[] args)
	{
		Parent p=new Parent();
		System.out.println("parent main");
	}
	public void m1()
	{
		System.out.println(j);
	}
	int j=100;
	
}
class InstanceControlFlowPtoC extends Parent
{
	int x=100;
	{
	  m2();
	  System.out.println("child instance block");
	}
	InstanceControlFlowPtoC ()
	{
		System.out.println("child constructor");
	}
	public static void main(String[] args)
	{
		InstanceControlFlowPtoC ic=new InstanceControlFlowPtoC ();
		System.out.println("child main");
	}
	public void m2()
	{
		System.out.println(y);
	}
	int y=200;
	
}
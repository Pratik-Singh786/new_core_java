package interfaceex;
interface Gettable
{
	void draw();
	default void msg()
	{
		System.out.println("default methods");
	}
}
public class DefaultMethodsInInterface    implements Gettable
{
  public void draw()
  {
	  System.out.println("drawing");
  }
	public static void main(String[] args) 
	{
		DefaultMethodsInInterface dm=new DefaultMethodsInInterface();
		dm.draw();
		dm.msg();

	}

}

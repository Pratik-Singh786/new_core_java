package interfaceex;
interface XYZ
{
	void draw();
	public static int cube(int a)
	{
		return a*a*a;
	}
}
class MyInterfaceImp implements XYZ
{
	public void draw()
	{
		System.out.println("drawing");
	}
	
}
public class StaticMethodsInInterface  extends MyInterfaceImp
{

	public static void main(String[] args) 
	{
      System.out.println( XYZ.cube(3));

	}

}

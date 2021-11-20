package constructors;
abstract class  X
{
	
}
class Test extends X
{
	//1.inheritance problem 
	
	Test t=new Test();
	//2.object creation will take much time.
}
//=====================================================
interface  XY
{
	
}
interface XYZ
{
	
}
class Test1 implements  XYZ,XY
{
	//1.Inheritance benefits
	Test1 t=new Test1();
	//2.object creation will take less time.
}
public class ComparisionAbstractClassAndInterface 
{

	public static void main(String[] args)
	{
		
		

	}

}

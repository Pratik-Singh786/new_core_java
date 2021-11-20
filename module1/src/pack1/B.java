package pack1;
import pack1.A;//Explicit import
import pack1.*;//implicit import not recommended
 class B extends A
{
	public static void main(String...args)
	{
      A obj =new A();
      obj.msg();
      B b=new B();
      b.msg();
      
	}
}

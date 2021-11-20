package generics;
class Test1<T extends Runnable> //no implements
{

}

public class BoundedTypeEx1
{
   Test1<Runnable>  t1=new Test1<Runnable>();
   Test1<Thread> t2=new Test1<Thread>();
   //Test1<Integer> t3=new Test1<Integer>(); CE
}

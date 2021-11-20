package generics;
class Test<T extends Number>
{

}
public class BoundedTypeEx
{
    //We can only pass Number and its child class in generics.
    Test<Integer> t1=new Test<Integer>();
    Test<Number> t2=new Test<Number>();
   // Test<String> t2=new Test<String>();

}

package generics;
//correct order
// we acn use any valid identifier in place of T(type parameter) like x, A ,pratik
class Test2<T extends Runnable & Comparable> //extends and then two interfaces
{

}
class Test3<T extends  Number & Runnable & Comparable >// class and two interfaces
{

}


public class BoundedTypeEx2
{
    // we acn use any valid identifier in place of T(type parameter) like x, A ,pratik
    class Myclass< x>
    {

    }
    class Myclass1<pratik>
    {

    }
    //based on our requirement we can declare any number of Type parameter sepeated with commas
    class MyClass2<A,B>
    {

    }
    class MyClass3<X,Y,Z>
    {

    }
}

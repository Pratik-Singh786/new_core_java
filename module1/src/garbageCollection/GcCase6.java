package garbageCollection;
class Student2
{

}

public class GcCase6
{
    static Student2 s;
    public static void main(String [] args)
    {
        m1();     //now only s will be eligible for gc
    }
    public static void  m1()
    {
         s=new Student2();
        Student2 s2=new Student2();
    }
}

package garbageCollection;
class Student1
{

}

public class GcCase5
{
    public static void main(String [] args)
    {
        m1();     //now both s1 and s2 both eligible for gc
    }
    public static Student1  m1()
    {
       Student1 s1=new Student1();
        Student1 s2=new Student1();
        return s1;
    }


}

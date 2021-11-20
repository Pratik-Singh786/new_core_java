package garbageCollection;
class Student
{

}

public class GcCase4
{
    public static void main(String [] args)
    {
       Student s= m1(); //now both s and s1 wilL point to same object,s2 eligible  for gc
    }
    public static Student m1()
    {
        Student s1=new Student();
        Student s2=new Student();
        return s1;

    }


}

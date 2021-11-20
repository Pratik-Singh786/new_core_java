package generics;

import java.util.ArrayList;

public class GenericsMethods
{
    public static void m1(ArrayList<String > l)
    {
       l.add("A") ;
       l.add(null);
       System.out.println(l);
    }
    /////////////////////////////////////////////////////////////////////////////////////////
    public static void m2(ArrayList<? extends Number> l1)
    {
        // the Number is class so we can call this method by passing AL<Number> class or its child Al<Number's child>
        // if the Number is an interface  so we can call this method by passing either of Number type or its
        //implemented class type
    }
    ////////////////////////////////////////////////////////////////////////////////////////////
    public static void m3(ArrayList<? super Thread> s)
    {
      //can be called by   Al<Thread> , Al<Object> objects not by Al<String>
    }


    public static void main(String [] args)
    {
         ArrayList al=new ArrayList();
         al.add("pratik");
         m1(al);

    }



}

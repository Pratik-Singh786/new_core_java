package garbageCollection;

import java.util.Date;

public class RequestingJvmForGc
{
    //tow waya to request JVM to run gc():-
   //1. System.gc()
    //2.Runtime r=Runtime.getRuntime();
    //its recommended to use Runtime.gc() bcz System.gc() internally calls Runtime.gc() so performance is better
    public static void main(String [] args)
    {
        Runtime r=Runtime.getRuntime();
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
        for(int i=0;i<1000;i++)
        {
            Date d=new Date();
            d=null;
        }
        System.out.println(r.freeMemory());
        r.gc();
        System.out.println(r.freeMemory());


    }


}

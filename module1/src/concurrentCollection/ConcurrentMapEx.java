package concurrentCollection;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapEx
{
    //Map(I)-> Concurrentmap(I)-> ConcurrentHashMap(I);
    public static void main(String [] args)
    {
        ConcurrentHashMap m= new ConcurrentHashMap(20);
        ConcurrentHashMap m1= new ConcurrentHashMap(20,20);
        ConcurrentHashMap m2= new ConcurrentHashMap(20,20,5);



        ConcurrentMap cm=new ConcurrentHashMap();
        cm.put(101,"pratik");
        cm.putIfAbsent(101,"shiva");//put only when key is not available.
        System.out.println(cm);
        //____________________________
        cm.put(102,"rahul");
       // cm.remove(102,"rahul");
        cm.replace(102,"ankit");
        System.out.println(cm);
    }

}

package concurrentCollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx1  extends Thread
{
    static CopyOnWriteArrayList l=new CopyOnWriteArrayList();
    public void run()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {

        }
        System.out.println("Child  thread updating list");
        l.add("C");
    }
    public static void main(String [] args) throws Exception
    {
        l.add("A");
        l.add("B");
        CopyOnWriteArrayListEx1 cw= new CopyOnWriteArrayListEx1();//class obj
        cw.start();
        Iterator itr= l.iterator();
        while(itr.hasNext())
        {
            String s1=(String) itr.next();
            System.out.println("Main thread iterating List and currently object is: "+s1);
            Thread.sleep(3000);
        }
        System.out.println(l);
    }



}

package concurrentCollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx3
{
    public static void main(String [] args)
    {
        CopyOnWriteArrayList cw=new CopyOnWriteArrayList();
        cw.add("A");
        cw.add("B");
        cw.add("C");
        Iterator itr=cw.iterator();
        cw.add("D");
        while(itr.hasNext())
        {
            String s=(String)itr.next();
            System.out.println(s);
        }


    }

}

package concurrentCollection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx2
{
    public static void main(String [] args)
    {
        CopyOnWriteArrayList cw=new CopyOnWriteArrayList();
        cw.add("A");
        cw.add("B");
        cw.add("C");
        cw.add("D");
        System.out.println(cw);
        Iterator itr= cw.iterator();
        //Iterator of cowal can't perform remove operatiton
        while(itr.hasNext())
        {
            String s=(String)itr.next();
            if(s.equals("D"))
            {
                itr.remove();
            }
        }
        System.out.println(cw);

    }

}

package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CurIterator
{
    public static void main(String [] args)
    {
        //we can use iterator on any collection object
        //limt:- we can only perform read and remove operation we can't perform replacement and readdition
        ArrayList al=new ArrayList();
        for(int i=0;i<=10;i++)
        {
            al.add(i);
        }
        System.out.println(al);
        Iterator itr= al.iterator();
        while(itr.hasNext())
        {
            Integer i=(Integer)itr.next();
            if(i%2==0)
            {
                System.out.println(i);
            }
            else
                itr.remove();


        }
        System.out.println(al);


    }

}

package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class CurListIterator
{
    public static void main(String [] args)
    {
        //Most poerful cursor but only applicable for List object
        LinkedList l=new LinkedList();
        l.add("Ram");
        l.add("Sita");
        l.add("Laxman");
        l.add("Chiru");
        System.out.println(l);
        ListIterator itr=l.listIterator();
        while(itr.hasNext())
        {
            String s= (String)itr.next();
            if(s.equals("Chiru"))
            {
                itr.remove();
            }
            else if(s.equals("Ram"))
            {
                itr.add("Shree");
            }
            else if(s.equals("Sita"))
            {
                itr.add("mata");
            }
        }
        System.out.print(l);

    }

}

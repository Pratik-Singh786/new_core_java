package Collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class LArrayList1
{
    public static void main(String [] args)
    {
        //cons
        ArrayList al1= new ArrayList(); //current capacity*3/2+1
        ArrayList al2= new ArrayList(100);
       // ArrayList al3= new ArrayList(Collection c);

        ArrayList al= new ArrayList();
        LinkedList ll=new LinkedList();
        System.out.println(al instanceof Serializable);
        System.out.println(ll instanceof Cloneable);
        System.out.println(al instanceof RandomAccess);
        System.out.println(ll instanceof RandomAccess);


    }

}

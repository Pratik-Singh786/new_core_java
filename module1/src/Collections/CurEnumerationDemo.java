package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class CurEnumerationDemo
{
    //Limitation :- we can only apply on the legacy classes;
    //we have only read access and we can't perform remove operation;
    public static void main(String [] args)
    {
        Vector v=new Vector();
        for(int i=0;i<=10;i++)
        {
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration e=v.elements();
        while(e.hasMoreElements())
        {
            Integer I=(Integer)e.nextElement();
            if(I%2==0)
            {
                System.out.println(I);
            }
            else
            {
                System.out.println(I+" will be removed");
                v.remove(I);
                System.out.println(v);
            }

        }

    }

}

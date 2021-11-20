package Collections;

import java.util.Vector;

public class LVector
{

    public static void main(String []args)
    {
        //cons
        //1.
        Vector v=new Vector();
        //2.
        Vector v1=new Vector(40);
        //3.
        Vector v2=new Vector(1000,5);
        //4.
       // Vector v2=new Vector(Coolection c);

        System.out.println(v.capacity());
        for(int i=0;i<=10;i++)
        {
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement("A");



    }

}

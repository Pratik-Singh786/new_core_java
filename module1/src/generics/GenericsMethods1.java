package generics;

import java.util.ArrayList;

public class GenericsMethods1
{
    public static void main(String [] args)
    {
        ArrayList<String> l=new ArrayList<String>();
        l.add("durga");
        l.add("Ravi");
        //l.add(10);
        m1(l);
        System.out.println(l);

    }
    public static void m1(ArrayList l)
    {
        l.add(10);
        l.add(10.5);
        l.add(true);
    }


}

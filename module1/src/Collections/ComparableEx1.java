package Collections;

import java.util.TreeSet;

public class ComparableEx1
{
    public static void main(String [] args)
    {
        TreeSet t=new TreeSet();
        t.add("k");
        t.add("Z");
        t.add("A");
        t.add("A");
        System.out.println(t);//jvm will internally call compareTo() of Comparable Interface

    }
}

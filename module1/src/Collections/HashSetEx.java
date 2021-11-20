package Collections;

import java.util.HashSet;

public class HashSetEx
{
    public static void main(String [] args)
    {
        // duplicates are not allowed
        //insertion order is not preserved
        HashSet h=new HashSet();
        HashSet h1=new HashSet(19);
        HashSet h2=new HashSet(10, 9); //i.c loadfactor
        //HashSet h3=new HashSet(Colletion c);

        h.add("B");
        h.add("B");
        h.add("A");
        h.add("C");
        h.add("D");
        h.add(null);
        h.add(10);
        System.out.println(h.add("2"));
        System.out.println(h);





    }

}

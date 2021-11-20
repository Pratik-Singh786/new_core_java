package Collections;

import java.util.Set;
import java.util.TreeSet;

public class STreeSet
{
    public static void main(String [] args)
    {
        //In treeSet and TreeMap Homogeneous objects of any types are possible.
        TreeSet ts=new TreeSet();
       // ts.add(new Integer(10));
        ts.add("a");
        ts.add("B");
        ts.add("z");
        ts.add("L");
        //ts.add(new Integer(10));

        System.out.println(ts);
      //  ts.add(new Integer(10)); CCE
      //  ts.add(null); null not allowed



    }
}

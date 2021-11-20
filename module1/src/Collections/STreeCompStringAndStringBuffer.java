package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class STreeCompStringAndStringBuffer
{
    public static void main(String [] args)
    {
        TreeSet t =new TreeSet( new MyComparator3());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add("XX");
        t.add(new StringBuffer("ABCD"));
        t.add("A");


        System.out.println(t);
    }

}
class MyComparator3 implements Comparator {
    public int compare(Object obj1, Object obj2)
    {
        String s1=obj1.toString();
        String s2=obj2.toString();
        // return s2.compareTo(s1);  //desending order
        // return -s1.compareTo(s2);

        //both are same
        return s1.compareTo(s2);// ascending order
    }


}




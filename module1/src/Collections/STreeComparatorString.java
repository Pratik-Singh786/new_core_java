package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class STreeComparatorString
{

    public static void main(String [] args)
    {
        TreeSet t =new TreeSet( new MyComparator1());
        t.add("Ram");
        t.add("Sita");
        t.add("Krishna");
        t.add("Mohan");

        System.out.println(t);



    }

}
class MyComparator1 implements Comparator {
    public int compare(Object obj1, Object obj2)
    {
        String s1=obj1.toString();
        String s2=(String)obj2;
       // return s2.compareTo(s1);  //desending order
       // return -s1.compareTo(s2);

        //both are same
        return s1.compareTo(s2);// ascending order


    }
}

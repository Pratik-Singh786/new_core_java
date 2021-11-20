package Collections;
import java.util.*;
public class LArrayList
{
    //ArrayList and Vector implements RandomAccess;
    public static void main(String [] args)
    {
        ArrayList al=new ArrayList<Integer>();
        al.add(80);
        al.add(10);
        al.add("A");
        al.add("B");
        al.add(null);
        al.get(1);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.add(2,"M");
        System.out.println(al);
        al.add("N");
        System.out.println(al);





    }

}

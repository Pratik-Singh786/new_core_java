package Collections;

import java.util.Comparator;
import java.util.TreeMap;

public class MTreeMapComparator
{
    public static void main(String [] args)
    {
        TreeMap tm= new TreeMap();
        //  TreeMap t=new TreeMap(Comparator c)
        //  TreeMap t1=new TreeMap(SortedMap p);
        //  TreeMap t2=new TreeMap(Map m);
        tm.put("ZZZ",100);
        tm.put("XXX",103);
        tm.put(101,"XXX");
        tm.put(104,106);

    }

}
 class ComparatorEx implements Comparator
{
    public int compare(Object obj ,Object obj1)
    {
        String s1= obj.toString();
        String s2= obj.toString();
        return s2.compareTo(s1);



    }


}


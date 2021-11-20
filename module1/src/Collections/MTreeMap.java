package Collections;

import java.util.Comparator;
import java.util.TreeMap;
class MyComp  implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        Integer i1= (Integer)obj1;
        Integer i2=(Integer)obj2;
        return i1.compareTo(i2);
        // return -i1.compareTo(i2);
        //return i2.compareTo(i1);
    }

}

public class MTreeMap
{
    public static void main(String [] args)
    {
        //Default natural sorting order
        TreeMap tm= new TreeMap(new MyComp());
      //  TreeMap t=new TreeMap(Comparator c)
      //  TreeMap t1=new TreeMap(SortedMap p);
      //  TreeMap t2=new TreeMap(Map m);
        tm.put(100,"ZZZ");
        tm.put(103,"XXX");
        tm.put(101,"XXX");
        tm.put(104,106);
       // tm.put("FFF","XXX");//CCE
      //  tm.put(null,"XXX"); //NPE
        System.out.println(tm);




    }

}

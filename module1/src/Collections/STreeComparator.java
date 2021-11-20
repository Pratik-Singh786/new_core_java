package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class STreeComparator
{
    //customized sorting
    //1.compare()
    //2.equals()
    //Wap to insert integer in TreeSet where the sorting order is descending order
    public static void main(String [] args)
    {
        TreeSet t =new TreeSet( new MyComparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);



    }

}
class MyComparator implements Comparator
{
    public int compare(Object obj1 ,Object obj2)
    {
        Integer I1=(Integer)obj1;
        Integer I2=(Integer)obj2;

        if(I1<I2)
            return +1;
        else if(I1>I2)
            return -1;
        else
            return 0;

       //2. return  I1.compareTo(I2); Default natural sorting order

      //3.  return  -I1.compareTo(I2);  descending order
        // 4. return  I2.compareTo(I1);
       //5. return  -I2.compareTo(I1);  Ascending order
       //6. return  +1 ;  //Insertion order
        //7. return -1; reverse Insertion order
        //8. return 0









    }

}


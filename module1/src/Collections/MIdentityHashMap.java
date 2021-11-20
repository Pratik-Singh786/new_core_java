package Collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class MIdentityHashMap
{
    public static void main(String [] args)
    {
        IdentityHashMap hm=new IdentityHashMap();
        Integer I1=new Integer(10);
        Integer I2=new Integer(10);
        hm.put(I1,"pawan");
        hm.put(I2,"kalyan");
        System.out.println(I1==I2);



    }
}

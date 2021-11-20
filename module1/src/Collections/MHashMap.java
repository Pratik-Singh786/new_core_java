package Collections;

import java.util.*;

public class MHashMap
{
    public static void main(String [] args)
    {
        HashMap hm=new HashMap();
        HashMap hm1=new HashMap(20);
        HashMap hm2=new HashMap(30,40);
       // HashMap hm3=new HashMap(Map m);

        hm.put("Chiranjeevi",700);
        hm.put("bailaish",1000);
        hm.put("pravash",300);
        hm.put("NTR",200);
        hm.put("nani",1000);
        System.out.println(hm);
        // printing keys
        Set s =hm.keySet();
        System.out.println(s);

        //printing the values

        Collection c=hm.values();
        System.out.println(c);

        //printing the  keys and values;

        Set s1=hm.entrySet();
        System.out.println(s1);


        Iterator itr=s1.iterator();
        while(itr.hasNext())
        {
            Map.Entry m1=(Map.Entry)itr.next();
            System.out.println(m1.getKey()+"..."+m1.getValue());
            if(m1.getKey().equals("NTR"))
            {
                m1.setValue(1000);
            }
        }
        System.out.println(hm);




    }

}

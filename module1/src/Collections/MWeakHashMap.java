package Collections;

import java.util.HashMap;
import java.util.WeakHashMap;
class Temp
{
    public String toString()
    {
        return "temp";
    }
    public void finalize()
    {
        System.out.println("finalize method called");
    }


}

public class MWeakHashMap
{
    public static void main(String [] args) throws Exception
    {
        HashMap h=new HashMap();//if we replace whm with hm then we will get temp=durga 2 times;
        WeakHashMap m=new WeakHashMap();
        Temp t=new Temp();
        m.put(t,"durga");
        System.out.println(m);
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);

        //If we replace HashMap with WeakHashMap then it will eligible for gc because HashMap dominates over Gc.




    }

}

package concurrentCollection;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetEx
{
    //for every update operation a cloned copy will be created ,so if multiple update operations  are it is not recommended
    //to use cowas
    public static void main(String [] args)
    {
        CopyOnWriteArraySet s=new CopyOnWriteArraySet();
        CopyOnWriteArraySet s1=new CopyOnWriteArraySet();

        s.add("D");
        s.add("B");
        s.add("C");
        s.add(null);
        s.add(10);
        s.add("D");
        System.out.println(s);

    }

}

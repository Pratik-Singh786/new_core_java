package Collections;

import java.util.LinkedList;

public class LLinkedList
{
    public static void main(String []args)
    {
        //cons
        LinkedList l1 = new LinkedList();
        //LinkdList l1=new LinkedList(Collection c);
        l1.add("pratik");
        l1.add(null);
        l1.add(30);
        l1.add("pratik");
        l1.set(0,"software");
        l1.add("venky");
        l1.removeLast();
        l1.addFirst("ccc");
        System.out.println(l1);
        l1.addLast("ShreeRam");
        System.out.println(l1);


    }


}

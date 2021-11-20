package Collections;

import java.util.Stack;

public class LStack
{
    //Child class of the vector;
    public static void main(String [] args)
    {
        Stack s=new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push(1);
        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.search("2"));
       System.out.println(s.peek());



    }

}

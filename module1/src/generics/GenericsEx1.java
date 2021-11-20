package generics;

import java.util.ArrayList;

public class GenericsEx1
{

    //1. to ressolve type casting problem
    //2.type safety
    public static void main(String [] args)
    {
        //In case of array
        String s[]=new String[10];
        s[0]="pratik";
        //it will always type safe because all elements will be type safe.

        //but in the case of collection we don't know about data types of elements so we need to ensure type safety.
        ArrayList al=new ArrayList();
        al.add("durga");
        //String name=al.get(0); C.E
        String name= (String)al.get(0);//type-casting is mandatory here



    }

}

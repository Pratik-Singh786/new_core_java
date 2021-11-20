package generics;

import java.util.ArrayList;

public class GenericsEx2
{
    public static void main(String [] args)
    {
        ArrayList<String> al=new ArrayList<String>();// data type of obj is fixed
        al.add("pratik");
        al.add("ankit");
        String name=al.get(0); //we dont need to typecast it, at retrival.


    }

}

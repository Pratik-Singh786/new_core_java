package enumeration;
enum Trees
{
  MANGO,BANANA,ORANGE;
    Trees()
    {
        System.out.println("constructor");
    }


}
public class EnumConstructor
{
    public static void main(String [] args)
    {
        Trees t=Trees.MANGO;
        System.out.println("hello");
        //Constructor will be invoked for every enum
    }


}

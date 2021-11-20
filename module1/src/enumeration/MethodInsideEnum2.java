package enumeration;
enum Color1
{
        BLUE,RED
        {
          public void info()
          {
           System.out.println("Dangerous color");
          }
        }
        ,Green;
        public void info()
        {
            System.out.println("universal color");
        }

}
public class MethodInsideEnum2
{
    public static void main(String [] args)
    {
        Color1[] c1 = Color1.values();
        for (Color1 c2 : c1)
        {
           c2.info();
        }
    }

}

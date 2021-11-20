package assertions;

public class Assertex2
{
    public static void main(String [] args)
    {
        int x=10;
        assert x>10:m1(); //if first statement is wrong then only 2nd will be executed

        System.out.println(x);
    }
    public static int m1()
    {
        return 777;
    }

}

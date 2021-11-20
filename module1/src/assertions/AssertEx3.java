package assertions;

public class AssertEx3
{
    public static void main(String [] args)
    {
        int x=10;
        switch(x)
        {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                assert false; //always recommended to use where command generally do'nt reach.


        }


    }
}

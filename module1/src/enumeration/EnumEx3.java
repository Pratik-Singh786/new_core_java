package enumeration;
enum Beer1
{
    KF,KO,RC,FO;

}

public class EnumEx3
{

    public static void main(String [] args)
    {
        Beer b=Beer.RC;
        switch(b)
        {
            case KF:
                System.out.println("It is children brand");
                break;
            case KO:
                System.out.println("It is too light");
                break;
            case FO:
                System.out.println("Buy one and get one free");
                break;

           /* case Kalyani:
                System.out.println("Buy one and get one free"); undefined enum is not valid
                break;*/

            default:
               System.out.println("other brands");

        }

    }

}

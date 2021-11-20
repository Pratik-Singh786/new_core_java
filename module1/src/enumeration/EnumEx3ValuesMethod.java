package enumeration;
enum Drinks
{
    KF,KO,RC,FO;
}
// values() not present in java.lang.enum but in enum keyword itself
public class EnumEx3ValuesMethod
{
    public static void main(String [] args)
    {
        Drinks [] d=Drinks.values();
        for(Drinks d1:d)
        {
            System.out.println(d1+".."+d1.ordinal());
        }
    }


}

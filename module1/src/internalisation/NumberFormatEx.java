package internalisation;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatEx
{
    public static void main(String [] args)
    {
        double d=123456.789;
        Locale india=new Locale("punjabi","India");
        NumberFormat nf=NumberFormat.getCurrencyInstance(india);
        System.out.println("India form is"+nf.format(d));

        NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Us form is"+nf1.format(d));

        NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("Us form is"+nf2.format(d));


    }

}

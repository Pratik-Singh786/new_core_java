package internalisation;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatEx1
{
    public static void main(String [] args)
    {
        DateFormat us=DateFormat.getDateInstance(0, Locale.US);
        DateFormat uk=DateFormat.getDateInstance(0, Locale.UK);
        DateFormat itlay=DateFormat.getDateInstance(0, Locale.ITALY);

        System.out.println("Us style is"+us.format(new Date()));
        System.out.println("Uk style is"+uk.format(new Date()));
        System.out.println("itlay style is"+itlay.format(new Date()));


    }
}

package internalisation;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatEx2
{
    public static void main(String [] args)
    {
        DateFormat us=DateFormat.getDateTimeInstance(0, 0,Locale.US);
        System.out.println("uS style is"+us.format(new Date()));
    }
}

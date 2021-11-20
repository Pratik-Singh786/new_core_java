package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitMethodEx
{
    public static void main(String [] args)
    {
        Pattern p = Pattern.compile("\\s"); //it will print
        String []s = p.split("Pratik Software Solutions");
        {
            for(String s1:s)
            {
                System.out.println(s1);
            }

        }
    }

}

package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitMethodPattern
{
    public static void main(String [] args)
    {
        Pattern p = Pattern.compile("\\."); //
        String []s = p.split("www.pratikjobs.com");//target String
        {
            for(String s1:s)
            {
                System.out.println(s1);
            }


        }
    }
}

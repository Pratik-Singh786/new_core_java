package regEx;

import java.util.regex.Pattern;

public class SplitMethodString
{
    public static void main(String [] args)
    {
        // Pattern class spilt method can take target string as argument while String class split can't;
        String s="www.pratikjobs.com";
        String s1[]= s.split("\\.");//target String

            for(String s2:s1)
            {
                System.out.println(s2);
            }



    }
}

package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2
{
    public static void main(String [] args)
    {
        // [^abc]
        //[abc]
        //[a-z]
        //[0-9]
        //[a-z A-Z 0-9]
        Pattern p=Pattern.compile("[abc]");
        Matcher m=p.matcher("a3b#k@9z");
        while(m.find())
        {
            System.out.println(m.start() +" "+m.group());
        }


    }

}

package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx4
{
    //a= Exactly one a
    //a+= at lesat one a
    //a*= any number of a's
    //a?= Atmost one a
    public static void main(String [] args)
    {
        Pattern p = Pattern.compile("a+"); //it will print
        Matcher m = p.matcher("abaabaaab");
        {
            while (m.find())
            {
                System.out.println(m.start() + " " + m.group());
            }

        }
    }
}

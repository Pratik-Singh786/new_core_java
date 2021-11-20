package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3
{
    public static void main(String[] args)
    {
        // \\s ,\\S ,\\w ,\\W, \\d \\D
        Pattern p=Pattern.compile("\\s"); //it will print
        Matcher m=p.matcher("a7b k@9z");
        {
            while(m.find())
            {
                System.out.println(m.start()+" "+m.group());
            }

        }
    }

}

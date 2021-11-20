package regEx;

import java.util.StringTokenizer;

public class StringTokenizerEx1
{
    public static void main(String []args)
    {
        StringTokenizer st=new StringTokenizer("19-12-2020","-"); //the default regex for String Tokenizer " " /space
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }

    }
}

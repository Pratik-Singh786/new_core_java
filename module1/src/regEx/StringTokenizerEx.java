package regEx;

import java.util.StringTokenizer;

public class StringTokenizerEx
{
    public static void main(String []args)
    {
        StringTokenizer st=new StringTokenizer("pratik Software Solutions"); //the default regex for String Tokenizer " " /space
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }

    }

}

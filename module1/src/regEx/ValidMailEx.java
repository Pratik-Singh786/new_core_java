package regEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMailEx
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mailId->:");
        String s=sc.nextLine();
        Pattern p= Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_]*@[a-zA-Z0-9]+([.][0-zA-Z]+)+");
        //for gmail Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_]* @gmail[.]com");
        Matcher m=p.matcher(s);
        if(m.find() && m.group().equals(s))
        {
            System.out.println("Valid mail");
        }
        else
        {
            System.out.println("Invalid mail");
        }


    }


}

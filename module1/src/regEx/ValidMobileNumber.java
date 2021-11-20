package regEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNumber
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 10 digit mobile number:");
        String s=sc.nextLine();
        Pattern p= Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m=p.matcher(s);
        if(m.find() && m.group().equals(s))
        {
            System.out.println("Valid number");
        }
        else
        {
            System.out.println("Invalid number");
        }


    }

}

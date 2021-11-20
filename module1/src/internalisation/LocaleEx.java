package internalisation;

import java.util.Locale;

public class LocaleEx
{
    //if  the request coming form India the response should be in Indian form,
    //if the request coming from USA it should be in USA understable form
    public static void main(String [] args)
    {
        Locale l=new Locale("English");
        Locale l1=new Locale("English","India");
        Locale l2=Locale.getDefault();
        System.out.println(l2.getCountry()+" "+l2.getLanguage());
        System.out.println(l2.getDisplayCountry()+" "+l2.getDisplayLanguage());

        Locale l3=new Locale("panjabi","India");
        Locale.setDefault(l3);
       // Locale.setDefault(l3).getDisplayLanguage();
        String[] s4= Locale.getISOCountries();
        for(String s3:s4)
        {
            System.out.println(s3+" ");
        }
        String[] s5= Locale.getISOCountries();
        for(String s6:s5)
        {
            System.out.println(s6+" ");
        }
        Locale[] s1= Locale.getAvailableLocales();
        for(Locale s:s1)
        {
            System.out.println(s.getDisplayCountry()+"..."+s.getDisplayLanguage());
        }



    }

}

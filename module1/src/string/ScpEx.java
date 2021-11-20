package string;

public class ScpEx {

	public static void main(String[] args) 
	{
		String s=new String("pratikSinghRajput");//one object is created in heap area and one in scp area with content pratik;
		String s1="pratikSinghRajput"; //no new creation of object  because because object with same content is present in heap area
        System.out.println(s==s1);
        String s2="pratikSingh";
        String s3= s2.concat("Rajput");
        System.out.println(s==s3);
        String s4="pratikSinghRajput";
        System.out.println(s==s4);
	}

}
